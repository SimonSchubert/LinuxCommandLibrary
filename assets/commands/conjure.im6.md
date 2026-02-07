# TAGLINE

ImageMagick MSL script interpreter

# TLDR

**Execute a Magick Scripting Language** (MSL) script

```conjure.im6 [script.msl]```

**Execute with verbose output**

```conjure.im6 -verbose [script.msl]```

**Execute a script with custom defines**

```conjure.im6 -define [key]=[value] [script.msl]```

**Run in debug mode**

```conjure.im6 -debug all [script.msl]```

**Execute with specific resource limits**

```conjure.im6 -limit memory [256MB] [script.msl]```

# SYNOPSIS

**conjure.im6** [_options_] _script.msl_

# PARAMETERS

**-debug** _EVENTS_
> Enable debugging output for specified event types.

**-define** _KEY=VALUE_
> Set a configuration value accessible within the script.

**-limit** _TYPE VALUE_
> Set resource limits (memory, map, disk, file, thread, time).

**-log** _FORMAT_
> Log output format specification.

**-regard-warnings**
> Treat warnings as errors.

**-verbose**
> Enable verbose output during execution.

**-version**
> Display version information.

# DESCRIPTION

**conjure.im6** is the ImageMagick version 6 interpreter for Magick Scripting Language (MSL). MSL is an XML-based scripting language for performing complex image processing operations programmatically.

MSL scripts define image manipulation workflows using XML tags that correspond to ImageMagick operations. This allows creating reusable, parameterized image processing pipelines without writing shell scripts or using programming language bindings.

The scripting language supports variables, conditionals, loops, and all ImageMagick operations. It's particularly useful for batch processing and creating complex image manipulation templates that can be applied consistently across many images.

# CAVEATS

MSL is a specialized language with limited adoption compared to using ImageMagick from shell scripts or programming languages. ImageMagick 6 is in maintenance mode; ImageMagick 7 uses different scripting approaches. The **.im6** suffix ensures version 6 is used on systems with both versions installed.

# HISTORY

conjure was part of ImageMagick's scripting capabilities, allowing XML-based batch image processing. ImageMagick was created by John Cristy in **1990**. The versioned **conjure.im6** command was introduced when ImageMagick 7 brought breaking changes in **2016**, allowing both versions to coexist.

# SEE ALSO

[convert.im6](/man/convert.im6)(1), [magick](/man/magick)(1), [convert](/man/convert)(1)
