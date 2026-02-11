# TAGLINE

Configurable multi-language source code formatter

# TLDR

**Format a file** and output to stdout

```uncrustify -c [config.cfg] -f [source.c]```

**Format and write to output file**

```uncrustify -c [config.cfg] -f [source.c] -o [output.c]```

**Format files in place** with backup

```uncrustify -c [config.cfg] --replace [file1.c] [file2.c]```

**Format files in place** without backup

```uncrustify -c [config.cfg] --no-backup [*.c]```

**Specify language** explicitly

```uncrustify -c [config.cfg] -l [CPP] -f [source.cpp]```

**Generate default configuration**

```uncrustify --show-config > [uncrustify.cfg]```

**Process files from a list**

```uncrustify -c [config.cfg] -F [filelist.txt]```

# SYNOPSIS

**uncrustify** [_options_] [_files ..._]

# PARAMETERS

**-c** _cfg_
> Use specified configuration file (or '-' for defaults).

**-f** _file_
> Process single file, output to stdout.

**-o** _file_
> Write output to specified file.

**-F** _file_
> Read list of files to process (one per line, '-' for stdin).

**-l** _lang_
> Language override: C, CPP, D, CS, JAVA, PAWN, VALA, OC, OC+.

**--replace**
> Replace source files in place (creates backup).

**--no-backup**
> Replace files without backup.

**--mtime**
> Preserve modification time on replaced files.

**--frag**
> Treat input as code fragment with proper first-line indent.

**--show-config**
> Print active configuration to stdout.

**--update-config**
> Output new config file with current settings.

**--update-config-with-doc**
> Output config file with usage comments.

**--set** _key=value_
> Override configuration option.

**-q**
> Quiet mode, no stderr output.

**-h**, **--help**
> Display help message.

**--version**
> Display version information.

# DESCRIPTION

**uncrustify** is a highly configurable source code beautifier for C, C++, C#, Objective-C, D, Java, Pawn, and VALA. It automatically formats code according to specified style rules controlling indentation, spacing, alignment, and line breaks.

Configuration is controlled through a configuration file with hundreds of options. The default location is **$UNCRUSTIFY_CONFIG** or **~/.uncrustify.cfg**. Generate a starting configuration with **--show-config** and customize incrementally.

uncrustify can process single files, file lists, or entire source trees. It supports in-place editing with optional backups.

# CONFIGURATION

**$UNCRUSTIFY_CONFIG**
> Environment variable specifying the path to the configuration file.

**~/.uncrustify.cfg**
> Default user configuration file used when no -c option or environment variable is set.

# CAVEATS

Configuration complexity is high; start with generated defaults and adjust gradually. Different code styles may require extensive configuration tuning. Always test on a backup or version-controlled code before using **--no-backup**.

# HISTORY

uncrustify was created by **Ben Gardner** and first released in **2005**. It was designed to be a highly flexible code formatter supporting multiple languages. The project has grown to support over 700 configuration options, making it one of the most configurable code formatters available.

# SEE ALSO

[clang-format](/man/clang-format)(1), [astyle](/man/astyle)(1), [indent](/man/indent)(1)
