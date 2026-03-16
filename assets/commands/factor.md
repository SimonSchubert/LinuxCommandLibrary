# TAGLINE

prime factorization utility

# TLDR

**Factorize a number**

```factor [12]```

**Factorize multiple numbers**

```factor [12] [100] [256]```

**Read numbers from stdin**

```echo "[123456]" | factor```

**Factorize numbers interactively**

```factor```

**Factorize a large number**

```factor [9999999999999999999999]```

**Show prime factors using exponent notation**

```factor -h [1024]```

# SYNOPSIS

**factor** [_OPTION_] [_NUMBER_...]

# PARAMETERS

**-h**, **--exponents**
> Print factors in the form p^e instead of repeating prime p e times. If the exponent e is 1, it is omitted.

**--help**
> Display help information and exit.

**--version**
> Display version information and exit.

_NUMBER_
> One or more integers to factorize. If no numbers are given, reads from stdin.

# DESCRIPTION

**factor** prints the prime factors of each specified integer. For each input number, it outputs the number followed by a colon and its prime factors in ascending order, with repeated factors shown multiple times.

For example, **factor 12** outputs **12: 2 2 3** because 12 = 2 × 2 × 3. Prime numbers return themselves as the only factor. The number 1 has no prime factors and returns just **1:**.

When called without arguments, factor enters interactive mode, reading numbers from stdin one per line. This is useful for factoring many numbers or integrating with pipes.

The implementation uses trial division for small factors and Pollard's rho algorithm for larger numbers. GNU coreutils factor can handle arbitrarily large numbers when built with GNU MP support, while some implementations have size limits.

Common uses include mathematical exploration, cryptography education, number theory problems, and verifying primality (a prime number has only itself as a factor).

# CAVEATS

Very large numbers take longer to factor. Some implementations have limits on number size. Input must be positive integers. Zero has no prime factorization. Performance for large semiprimes (products of two large primes) is limited by fundamental mathematical constraints.

# HISTORY

**factor** is a classic Unix utility included in Version 1 Unix at Bell Labs in **1971**. It has remained part of Unix and Unix-like systems, now included in GNU coreutils. The command is one of the simpler mathematical utilities from Unix's early days, alongside **primes** which lists prime numbers.

# SEE ALSO

[primes](/man/primes)(6), [bc](/man/bc)(1), [dc](/man/dc)(1), [expr](/man/expr)(1)
