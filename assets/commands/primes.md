# TAGLINE

Generate prime numbers in a range

# TLDR

**Generate primes in range**

```primes [start] [stop]```

**List primes up to 100**

```primes 2 100```

**List primes from 1000 to 2000**

```primes 1000 2000```

# SYNOPSIS

**primes** [_start_] [_stop_]

# PARAMETERS

_START_
> Starting number.

_STOP_
> Ending number.

# DESCRIPTION

**primes** generates and prints all prime numbers within a specified numeric range. Given a start and stop value, it outputs one prime per line, making it easy to pipe into other commands for counting, filtering, or further processing.

This classic BSD utility is available on macOS natively and on Linux as part of the bsdgames package. It uses an efficient sieve algorithm for fast generation of primes even for large ranges.

# CAVEATS

BSD/macOS utility. Part of bsdgames on Linux.

# HISTORY

primes is a classic **BSD utility** for prime number generation.

# SEE ALSO

[factor](/man/factor)(1), [bc](/man/bc)(1)

