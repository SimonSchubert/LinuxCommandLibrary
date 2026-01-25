# TLDR

**Start Prime95 (interactive)**

```mprime```

**Run torture test**

```mprime -t```

**Run specific test type**

```mprime -t -W[1]```

**Run as daemon**

```mprime -d```

**Set worker threads**

```mprime -t -w[4]```

# SYNOPSIS

**mprime** [_options_]

# PARAMETERS

**-t**
> Torture test mode.

**-d**
> Run as daemon.

**-w** _n_
> Number of workers.

**-W** _type_
> Torture test type.

**-m**
> Menu mode.

**-v**
> Print version.

# DESCRIPTION

**mprime** (Prime95 for Linux) is the Great Internet Mersenne Prime Search (GIMPS) client. It searches for Mersenne primes and can also be used for CPU stress testing and benchmarking.

The torture test mode is popular for testing system stability, especially after overclocking.

# TORTURE TEST TYPES

```
1 - Small FFTs (tests L2 cache)
2 - In-place FFTs (tests RAM)
3 - Large FFTs (tests all)
4 - Blend (mixed test)
```

# CONFIGURATION

```
~/.mlucas/
~/primenet.ini
~/local.txt
```

# CAVEATS

Extremely CPU intensive. Generates significant heat. Not suitable for laptops. May require GIMPS account for prime search.

# HISTORY

Prime95/mprime was created by **George Woltman** in **1996** for the GIMPS project. It has discovered several record-breaking Mersenne primes.

# SEE ALSO

[stress](/man/stress)(1), [stress-ng](/man/stress-ng)(1), [cpuburn](/man/cpuburn)(1), [memtest86](/man/memtest86)(8)
