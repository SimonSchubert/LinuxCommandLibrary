# TLDR

**Preview converting filenames** from Latin1 to UTF-8

```convmv -f latin1 -t utf-8 [path/to/files/*]```

**Actually convert filenames** (apply changes)

```convmv -f latin1 -t utf-8 --notest [path/to/files/*]```

**Convert filenames recursively** in a directory

```convmv -f latin1 -t utf-8 -r --notest [path/to/directory]```

**Convert from Windows encoding** to UTF-8

```convmv -f cp1252 -t utf-8 --notest [path/to/files/*]```

**Lowercase all filenames**

```convmv --lower --notest [path/to/files/*]```

**Fix double-encoded UTF-8** filenames

```convmv --fixdouble -f utf-8 -t utf-8 --notest [path/to/files/*]```

# SYNOPSIS

**convmv** [_options_] _file_...

# PARAMETERS

**-f** _ENCODING_
> Source encoding (from encoding).

**-t** _ENCODING_
> Target encoding (to encoding).

**-r**
> Recurse into subdirectories.

**--notest**
> Actually perform the conversion (default is dry run).

**--nfc**
> Normalize to Unicode NFC form.

**--nfd**
> Normalize to Unicode NFD form.

**--lower**
> Convert filenames to lowercase.

**--upper**
> Convert filenames to uppercase.

**--fixdouble**
> Fix double-encoded UTF-8 filenames.

**--list**
> List available encodings.

**--preserve-mtimes**
> Preserve modification times on directories.

# DESCRIPTION

**convmv** is a utility for converting filenames between different character encodings. It's essential when files created on one system with a particular locale need to be used on another system with a different character encoding.

Common use cases include migrating files from Windows (using cp1252 or ISO-8859-1) to Linux with UTF-8, or fixing filenames that were created with incorrect encoding assumptions. The tool can also fix double-encoded UTF-8, which occurs when UTF-8 bytes are mistakenly encoded as UTF-8 again.

By default, convmv performs a dry run showing what would be changed. The **--notest** flag must be explicitly provided to actually rename files. This safety feature prevents accidental mass renaming operations.

# CAVEATS

Always run without **--notest** first to preview changes. The tool cannot detect the source encoding automatically; you must know what encoding was used originally. Converting to a less expressive encoding may cause data loss. Symbolic links and hard links require careful handling.

# HISTORY

convmv was written by Langsweirdt and has been a standard tool for handling encoding issues on Unix systems. It became particularly important during the transition from locale-specific encodings to UTF-8 as the universal standard in the 2000s.

# SEE ALSO

[mv](/man/mv)(1), [rename](/man/rename)(1), [iconv](/man/iconv)(1), [recode](/man/recode)(1)
