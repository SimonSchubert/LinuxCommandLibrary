# TAGLINE

CPU architecture fetching tool

# TLDR

**Display** CPU information with default settings

```cpufetch```

**Display** with a specific color scheme

```cpufetch --color [amd]```

**Use** custom RGB colors

```cpufetch --color [239,90,45:210,200,200:0,0,0:100,200,45:0,200,200]```

**Use** the retro style

```cpufetch --style retro```

**Show** full unabbreviated CPU name

```cpufetch --full-cpu-name```

**Force** small logo for narrow terminals

```cpufetch --logo-short```

# SYNOPSIS

**cpufetch** [_OPTION_]...

# PARAMETERS

**-c**, **--color** _scheme_
> Set the color scheme. Accepts predefined names (intel, amd, ibm, arm) or custom RGB values in the format R,G,B:R,G,B:R,G,B:R,G,B:R,G,B (first 3 for ASCII art, last 2 for text).

**-s**, **--style** _style_
> Set the style of the CPU logo: fancy (default), retro, or legacy (no color support).

**-F**, **--full-cpu-name**
> Show the full CPU name without abbreviation.

**--logo-short**
> Force display of the short version of the logo.

**--logo-long**
> Force display of the long version of the logo.

**--logo-intel-old**
> Use the old Intel logo.

**--logo-intel-new**
> Use the new Intel logo.

**-d**, **--debug**
> Print CPU model and CPUID levels for debugging.

**-v**, **--verbose**
> Print extra information about fetching process.

**-r**, **--raw**
> Print raw CPUID data for debugging.

**-h**, **--help**
> Print help and exit.

**-V**, **--version**
> Print version and exit.

# DESCRIPTION

**cpufetch** is a command-line utility written in C that displays detailed CPU architecture information in a visually appealing format, similar to how neofetch displays system information but focused specifically on the CPU. It renders ASCII art of the CPU manufacturer's logo alongside technical details including CPU name, microarchitecture, core and thread count, maximum frequency, semiconductor technology, cache sizes, AVX/FMA/SSE support, and theoretical peak performance.

Supports x86_64, ARM, RISC-V, and PowerPC architectures across Linux, Windows, Android, macOS, and FreeBSD.

# CAVEATS

The peak performance calculation uses the maximum CPU frequency but does not account for AVX-specific frequency throttling. For accurate peak performance measurements, use **peakperf** instead. macOS ARM support is limited to Apple Silicon chips only. FreeBSD support is limited to x86_64/x86.

# HISTORY

**cpufetch** was created by **Dr-Noob** with the first commit in **March 2018**. Written in C under the GPL-2.0 license. The latest version is v1.07 (November 2025). The same author also created **gpufetch** for GPU information and **peakperf** for accurate CPU performance measurement.

# SEE ALSO

[neofetch](/man/neofetch)(1), [fastfetch](/man/fastfetch)(1), [lscpu](/man/lscpu)(1), [screenfetch](/man/screenfetch)(1)
