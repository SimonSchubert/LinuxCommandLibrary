# TAGLINE

ImageMagick MSL script interpreter

# TLDR

**Execute a Magick Scripting Language** (MSL) script

```conjure.im6 [script.msl]```

**Execute with verbose output**

```conjure.im6 -verbose [script.msl]```

**Pass key/value pairs** to a script

```conjure.im6 -[key] [value] [script.msl]```

**Run in debug mode**

```conjure.im6 -debug all [script.msl]```

**Display version information**

```conjure.im6 -version```

# SYNOPSIS

**conjure.im6** [_options_] _script.msl_

# PARAMETERS

**-debug** _EVENTS_
> Enable debugging output for specified event types.

**-help**
> Print program options.

**-log** _FORMAT_
> Format of debugging information.

**-monitor**
> Monitor progress of image processing operations.

**-quiet**
> Suppress all warning messages.

**-regard-warnings**
> Treat warnings as errors.

**-seed** _VALUE_
> Seed a pseudo-random number generator.

**-verbose**
> Enable verbose output during execution.

**-version**
> Display version information.

# DESCRIPTION

**conjure.im6** is the ImageMagick version 6 interpreter for Magick Scripting Language (MSL). MSL is an XML-based scripting language for performing image processing operations.

MSL scripts define image manipulation workflows using XML tags that correspond to ImageMagick operations. Any other **-key value** pairs on the command line are made available to the script, for example **conjure.im6 -size 100x100 -color blue -foo bar script.msl**. It is primarily aimed at users who want custom image processing without needing a programming language or compiler.

# CAVEATS

The **.im6** suffix is a distribution packaging name, not an upstream ImageMagick command. Debian 12 ships the binary as **conjure-im6.q16** instead, and newer Debian releases package ImageMagick 7, so scripts that call **conjure.im6** may fail. ImageMagick's MSL has limited adoption compared to using ImageMagick from shell scripts or programming languages.

# HISTORY

ImageMagick was created by John Cristy in **1990**.

# SEE ALSO

[composite.im6](/man/composite.im6)(1), [display.im6](/man/display.im6)(1), [mogrify.im6](/man/mogrify.im6)(1), [magick](/man/magick)(1), [convert](/man/convert)(1)

# RESOURCES

```[Source code](https://github.com/ImageMagick/ImageMagick6)```

```[Homepage](https://imagemagick.org)```

```[Documentation](https://legacy.imagemagick.org/script/conjure.php)```

<!-- verified: 2026-11-09 -->
