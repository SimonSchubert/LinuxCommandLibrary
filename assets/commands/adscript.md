# TAGLINE

Audio and digital signal processing language compiler

# TLDR

**Compile** an ADscript file

```adscript [script.ad]```

Compile with **output file**

```adscript [script.ad] -o [output]```

**Run** an ADscript directly

```adscript -r [script.ad]```

# SYNOPSIS

**adscript** [_options_] _file_

# DESCRIPTION

**adscript** is a compiler for the ADscript programming language, a domain-specific language designed for audio and digital signal processing applications. It generates optimized code for audio processing tasks.

ADscript combines functional programming concepts with audio-specific primitives, making it suitable for developing audio plugins, synthesis engines, and signal processing algorithms.

# PARAMETERS

**-o** _file_
> Specify output file name

**-r**
> Run the script directly instead of compiling

**-O** _level_
> Optimization level (0-3)

**-v**, **--verbose**
> Enable verbose output

**--help**
> Display help information

# CAVEATS

ADscript is a specialized language; general-purpose programming may be better suited to other languages. Performance depends on target platform and optimization settings.

# HISTORY

ADscript was developed for audio programming applications, providing a high-level abstraction over low-level audio processing operations while maintaining performance characteristics needed for real-time audio.

# SEE ALSO

[faust](/man/faust)(1), [csound](/man/csound)(1)
