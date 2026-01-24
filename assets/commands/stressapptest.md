# TLDR

**Run memory stress**

```stressapptest -s [60]```

**With specific memory**

```stressapptest -M [1024] -s [60]```

**File test**

```stressapptest -f [/tmp/testfile] -s [60]```

**Verbose output**

```stressapptest -v [2] -s [60]```

**Multiple threads**

```stressapptest -m [4] -s [60]```

# SYNOPSIS

**stressapptest** [_-s seconds_] [_-M mbytes_] [_-m threads_] [_options_]

# PARAMETERS

**-s** _SEC_
> Duration seconds.

**-M** _MB_
> Memory in MB.

**-m** _N_
> Memory threads.

**-f** _FILE_
> Test file.

**-v** _LEVEL_
> Verbosity level.

**-l** _FILE_
> Log file.

# DESCRIPTION

**stressapptest** tests system stability. It stresses memory and I/O.

Memory testing. Find hardware errors.

I/O stress included. Disk testing.

ECC error detection. Memory reliability.

Thermal testing. Heat generation.

# CAVEATS

Generates heat. May trigger failures. Use carefully on production.

# HISTORY

**stressapptest** was developed by **Google** to stress test memory subsystems and find hardware errors.

# SEE ALSO

[stress](/man/stress)(1), [memtester](/man/memtester)(1), [mprime](/man/mprime)(1)
