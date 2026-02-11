# TAGLINE

Find ROP gadgets in binary executables

# TLDR

**Find gadgets in binary**

```ROPgadget --binary [binary]```

**Search for specific gadget**

```ROPgadget --binary [binary] --string "[/bin/sh]"```

**Filter gadgets by regex**

```ROPgadget --binary [binary] --re "[pop.*ret]"```

**Show only unique gadgets**

```ROPgadget --binary [binary] --nojop```

**Limit gadget depth**

```ROPgadget --binary [binary] --depth [5]```

**Generate ropchain**

```ROPgadget --binary [binary] --ropchain```

**Output to file**

```ROPgadget --binary [binary] > [gadgets.txt]```

# SYNOPSIS

**ROPgadget** [_--binary file_] [_--string str_] [_--re pattern_] [_options_]

# PARAMETERS

**--binary** _FILE_
> Target binary.

**--string** _STR_
> Find string in binary.

**--re** _REGEX_
> Filter by regex.

**--ropchain**
> Generate ROP chain.

**--depth** _N_
> Gadget instruction depth.

**--nojop**
> No JOP gadgets.

**--nosys**
> No syscall gadgets.

**--multibr**
> Multiple branches.

**--all**
> All sections.

# DESCRIPTION

**ROPgadget** finds ROP (Return-Oriented Programming) gadgets in binaries. It's used for exploit development and security research.

Gadgets are small instruction sequences ending in returns. They're chained to build exploits.

String searching finds useful data in binaries. Shell paths and other strings located.

Automatic ropchain generation builds exploit templates. Creates execve chains for common scenarios.

Depth limits instruction sequence length. Shorter gadgets are generally more useful.

# CAVEATS

For authorized security research only. Understanding assembly required. Results need manual analysis.

# HISTORY

**ROPgadget** was created by **Jonathan Salwan** for ROP exploit development. It's widely used in CTF competitions and security research.

# SEE ALSO

[ropper](/man/ropper)(1), [objdump](/man/objdump)(1), [pwntools](/man/pwntools)(1), [radare2](/man/radare2)(1)
