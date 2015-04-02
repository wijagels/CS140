package pippin;

import java.util.Map;
import java.util.TreeMap;

public class MachineModel {
    public class Registers {
        private int accumulator;
        private int programCounter;
    }

    public final Map<Integer, Instruction> INSTRUCTION_MAP = new TreeMap<>();
    private Registers cpu = new Registers();
    private Memory memory = new Memory();

    public MachineModel() {
        //INSTRUCTION_MAP entry for "NOP"
        INSTRUCTION_MAP.put(0,(arg, level) -> {
            cpu.programCounter ++;          
        });

        //INSTRUCTION_MAP entry for "LOD"
        INSTRUCTION_MAP.put(0x1,(arg, level) -> {
            if(level < 0 || level > 2) {
                throw new IllegalArgumentException("Illegal indirection level in LOD instruction");
            }
            if (level > 0) {
                INSTRUCTION_MAP.get(0x1).execute(memory.getData(arg), level-1); 
            } else { 
                cpu.accumulator = arg;
                cpu.programCounter ++;
            }
        });

        //INSTRUCTION_MAP entry for "STO"
        INSTRUCTION_MAP.put(0x2,(arg, level) -> {
            if(level < 1 || level > 2) {
                throw new IllegalArgumentException("Illegal indirection level in STO instruction");
            }
            if (level > 1) {
                INSTRUCTION_MAP.get(0x2).execute(memory.getData(arg), level-1); 
            } else { 
                memory.setData(arg, cpu.accumulator);
                cpu.programCounter ++;
            }
        });

        //INSTRUCTION_MAP entry for "ADD"
        INSTRUCTION_MAP.put(0x3,(arg, level) -> {
            if(level < 0 || level > 2) {
                throw new IllegalArgumentException("Illegal indirection level in ADD instruction");
            }
            if (level > 0) {
                INSTRUCTION_MAP.get(0x3).execute(memory.getData(arg), level-1); 
            } else { 
                cpu.accumulator += arg;
                cpu.programCounter ++;
            }
        });

        //INSTRUCTION_MAP entry for "SUB"
        INSTRUCTION_MAP.put(0x4,(arg, level) -> {
            if(level < 0 || level > 2) {
                throw new IllegalArgumentException("Illegal indirection level in SUB instruction");
            }
            if (level > 0) {
                INSTRUCTION_MAP.get(0x4).execute(memory.getData(arg), level-1); 
            } else {  
                cpu.accumulator -= arg;
                cpu.programCounter ++;
            }
        });

        //INSTRUCTION_MAP entry for "MUL"
        INSTRUCTION_MAP.put(0x5,(arg, level) -> {
            if(level < 0 || level > 2) {
                throw new IllegalArgumentException("Illegal indirection level in MUL instruction");
            }
            if (level > 0) {
                INSTRUCTION_MAP.get(0x5).execute(memory.getData(arg), level-1); 
            } else { 
                cpu.accumulator *= arg;
                cpu.programCounter ++;
            }
        });

        //INSTRUCTION_MAP entry for "DIV"
        INSTRUCTION_MAP.put(0x6,(arg, level) -> {
            if(level < 0 || level > 2) {
                throw new IllegalArgumentException("Illegal indirection level in DIV instruction");
            }
            if (level > 0) {
                INSTRUCTION_MAP.get(0x6).execute(memory.getData(arg), level-1);
            } else {
                cpu.accumulator /= arg;
                cpu.programCounter ++;
            }
        });

        //INSTRUCTION_MAP entry for "AND"
        INSTRUCTION_MAP.put(0x7,(arg, level) -> {
            if(level < 0 || level > 1) {
                throw new IllegalArgumentException("Illegal indirection level in AND instruction");
            }
            if (level > 0) {
                INSTRUCTION_MAP.get(0x7).execute(memory.getData(arg), level-1); 
            } else {  
                if(cpu.accumulator != 0 && arg != 0) {
                    cpu.accumulator = 1;            
                } else {
                    cpu.accumulator = 0;            
                }
                cpu.programCounter ++;
            }
        });

        //INSTRUCTION_MAP entry for "NOT"
        INSTRUCTION_MAP.put(0x8,(arg, level) -> {
            if(level != 0) {
                throw new IllegalArgumentException("Illegal indirection level in NOT instruction");
            }
            if(cpu.accumulator == 0) {
                cpu.accumulator = 1;            
            } else {
                cpu.accumulator = 0;            
            }
            cpu.programCounter ++;          
        });

        //INSTRUCTION_MAP entry for "JUMP"
        INSTRUCTION_MAP.put(0xB,(arg, level) -> {
            if(level < 0 || level > 1) {
                throw new IllegalArgumentException("Illegal indirection level in JUMP instruction");
            }
            if (level > 0) {
                INSTRUCTION_MAP.get(0xB).execute(memory.getData(arg), level-1); 
            } else {  
                cpu.programCounter = arg;
            }
        });

        //INSTRUCTION_MAP entry for "JMPZ"
        INSTRUCTION_MAP.put(0xC,(arg, level) -> {
            if(level < 0 || level > 1) {
                throw new IllegalArgumentException("Illegal indirection level in JMPZ instruction");
            }
            if (level > 0) {
                INSTRUCTION_MAP.get(0xC).execute(memory.getData(arg), level-1); 
            } else {
                if(cpu.accumulator == 0) {
                    cpu.programCounter = arg;
                } else {
                    cpu.programCounter++;               
                }
            }
        });


    }

    public int getData(int index) {
        return memory.getData(index);
    }

    public void setData(int index, int value) {
        memory.setData(index, value);
    }

    public Instruction get(Object key) {
        return INSTRUCTION_MAP.get(key);
    }

    int[] getData() {
        return memory.getData();
    }

    int getProgramCounter() {
        return cpu.programCounter;
    }

    int getAccumulator() {
        return cpu.accumulator;
    }

    void setAccumulator(int i) {
        cpu.accumulator = i;
    }


}
