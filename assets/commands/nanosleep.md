# TAGLINE

suspends execution of the calling thread for the specified duration

# TLDR

**Sleep for 1 second (C code)**

```struct timespec ts = {1, 0}; nanosleep(&ts, NULL);```

**Sleep for 500 milliseconds**

```struct timespec ts = {0, 500000000L}; nanosleep(&ts, NULL);```

**Sleep with remaining time**

```nanosleep(&req, &rem);```

# SYNOPSIS

**int nanosleep**(const struct timespec *_req_, struct timespec *_rem_)

# PARAMETERS

**req**
> Requested sleep time (seconds and nanoseconds).

**rem**
> Remaining time if interrupted (can be NULL).

# DESCRIPTION

**nanosleep** suspends execution of the calling thread for the specified duration. Unlike sleep(), it provides nanosecond precision and handles interruption gracefully.

The function returns immediately if interrupted by a signal, storing remaining time in rem.

# EXAMPLE

```c
#include <time.h>

int main() {
    struct timespec req = {0, 100000000L}; // 100ms
    struct timespec rem;

    while (nanosleep(&req, &rem) == -1) {
        req = rem; // Continue sleeping
    }
    return 0;
}
```

# TIMESPEC STRUCTURE

```c
struct timespec {
    time_t tv_sec;   // Seconds
    long   tv_nsec;  // Nanoseconds (0-999999999)
};
```

# CAVEATS

Actual resolution depends on system clock. May sleep slightly longer than requested. EINTR on signal delivery.

# HISTORY

nanosleep was introduced in **POSIX.1-2001** to provide high-resolution sleep functionality beyond the second granularity of sleep().

# SEE ALSO

[sleep](/man/sleep)(3), [usleep](/man/usleep)(3), [clock_nanosleep](/man/clock_nanosleep)(2), [select](/man/select)(2)
