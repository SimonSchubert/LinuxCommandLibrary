# TAGLINE

real-time reporting tool for Intel Core i3, i5, and i7 processors

# TLDR

**Start** i7z monitoring (requires root)

```sudo i7z```

# SYNOPSIS

**i7z** [_options_]

# DESCRIPTION

**i7z** is a real-time reporting tool for Intel Core i3, i5, and i7 processors. It displays CPU frequency, temperature, turbo boost states, and power management information in a console-based interface.

The tool reads CPU-specific MSRs (Model Specific Registers) to provide accurate information about processor performance states, including per-core frequencies and C-state residency.

# CAVEATS

Only works with Intel Core i3, i5, and i7 processors (Sandy Bridge and later). Requires root privileges to access CPU MSRs. May not work correctly with very new processor generations. Has been superseded by more modern tools like turbostat.

# HISTORY

i7z was developed to provide detailed Intel processor monitoring when existing tools lacked support for newer Intel processor features like Turbo Boost. Development started around **2009** with the introduction of the Intel Core i7 processor family.

# SEE ALSO

[turbostat](/man/turbostat)(8), [cpupower](/man/cpupower)(1), [sensors](/man/sensors)(1)
