# TLDR

**Test 1GB of memory**

```sudo memtester [1G] [1]```

**Test 512MB with 5 iterations**

```sudo memtester [512M] [5]```

**Test memory at a physical address**

```sudo memtester -p [0x10000000] [256M] [1]```

**Run infinite test** until interrupted

```sudo memtester [1G] [0]```

**Test 2GB of memory** for thorough checking

```sudo memtester [2G] [3]```

# SYNOPSIS

**memtester** [**-p** _PHYSADDR_] _MEMORY_ [_ITERATIONS_]

# PARAMETERS

_MEMORY_
> Amount of memory to test (e.g., 100K, 256M, 1G).

_ITERATIONS_
> Number of test loops. Use 0 for infinite testing.

**-p** _PHYSADDR_
> Test memory starting at physical address PHYSADDR.

# DESCRIPTION

**memtester** is a userspace utility for stress-testing memory subsystems. It allocates the specified amount of memory and runs a series of pattern tests to detect faults in RAM, including stuck address bits, coupling faults, and bit flips.

The tests include: stuck address, random value, compare XOR, compare SUB, compare MUL, compare DIV, compare OR, compare AND, sequential increment, solid bits, block sequential, checkerboard, bit spread, bit flip, walking ones, and walking zeroes.

memtester runs in userspace and tests virtual memory. For testing physical RAM at specific addresses (e.g., to confirm hardware faults), use the **-p** option with the physical address.

# CAVEATS

Root privileges are typically required to lock memory pages and prevent swapping. Testing cannot use more memory than is available; the kernel may kill the process if memory is exhausted. memtester tests memory from userspace and may not detect all hardware faults that kernel-level tools like memtest86+ would find.

# HISTORY

memtester was written by Charles Cazabon as a userspace alternative to boot-time memory testing tools. It allows memory testing without rebooting and can target specific memory regions, useful for diagnosing intermittent faults on running systems.

# SEE ALSO

[free](/man/free)(1), [vmstat](/man/vmstat)(8), [stress](/man/stress)(1)
