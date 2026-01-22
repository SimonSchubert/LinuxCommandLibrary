# TLDR

**Read 16 random bytes** from /dev/urandom

```head -c 16 /dev/urandom```

**Generate a random hexadecimal string**

```head -c 16 /dev/urandom | xxd -p```

**Generate a random base64 string**

```head -c 32 /dev/urandom | base64```

**Read from /dev/random** (blocking, high entropy)

```dd if=/dev/random bs=1 count=32```

**Check available entropy** in the pool

```cat /proc/sys/kernel/random/entropy_avail```

# SYNOPSIS

**/dev/random**

**/dev/urandom**

# DESCRIPTION

**/dev/random** and **/dev/urandom** are special character device files that provide access to the Linux kernel's cryptographically secure random number generator. They gather environmental noise from device drivers, hardware interrupts, and other sources into an entropy pool.

**/dev/urandom** (unlimited random) is the preferred source for most applications. It returns random bytes immediately without blocking, using a CSPRNG that reseeds from the entropy pool. It is suitable for encryption keys, session tokens, and general randomness needs.

**/dev/random** blocks when the entropy pool is estimated to be insufficient for the requested amount of randomness. This was historically considered more secure but is rarely necessary on modern systems. It may cause applications to hang waiting for entropy.

Both devices provide output suitable for cryptographic purposes on properly functioning systems.

# CAVEATS

**/dev/random** can block indefinitely on systems with limited entropy sources (headless servers, virtual machines). Use **/dev/urandom** unless you have specific requirements for blocking behavior.

Reading large amounts of data quickly may deplete the entropy pool temporarily. For bulk random data generation, consider **openssl rand** which uses the same underlying CSPRNG more efficiently.

Virtual machines may have limited entropy sources at boot time. Consider using **haveged** or hardware random number generators (HRNG) to supplement entropy.

# HISTORY

The /dev/random interface was introduced in **Linux 1.3.30** in 1995 by Theodore Ts'o. The design was influenced by PGP's random number generation and provides cryptographic-quality randomness from kernel-gathered entropy. The distinction between /dev/random and /dev/urandom has evolved over kernel versions, with modern kernels treating them nearly identically after initial seeding.

# SEE ALSO

[dd](/man/dd)(1), [head](/man/head)(1), [openssl](/man/openssl)(1), [haveged](/man/haveged)(8), [getrandom](/man/getrandom)(2)
