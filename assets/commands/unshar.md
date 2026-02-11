# TAGLINE

Extract files from shell archives

# TLDR

**Extract a shell archive**

```unshar [archive.shar]```

**Extract to specific directory**

```unshar -d [/path/to/directory] [archive.shar]```

**Overwrite existing files**

```unshar -c [archive.shar]```

**Extract from compressed archive**

```gzip -dc [archive.shar.gz] | unshar```

**Extract multiple archives from one file**

```unshar -e [combined.shar]```

**Extract from email message**

```unshar [message.txt]```

# SYNOPSIS

**unshar** [_options_] [_file_...]

# PARAMETERS

**-d**, **--directory** _dir_
> Change to directory before extracting.

**-c**, **--overwrite**
> Pass -c to shar script to overwrite existing files.

**-e**, **--exit-0**
> Separate archives at "exit 0" lines.

**-E**, **--split-at** _string_
> Split archives at specified string.

**-f**, **--force**
> Force overwrite without prompting.

**-h**, **--help**
> Display help.

**-V**, **--version**
> Display version.

# DESCRIPTION

**unshar** extracts files from shell archives (shar files). It scans input looking for shell archive headers, then executes each archive through the shell to extract its contents.

Shell archives are self-extracting scripts that contain files encoded as shell commands. They were historically used for distributing source code via email before modern archive formats became standard.

When processing email messages, unshar automatically locates and extracts embedded shell archives, ignoring mail headers and signatures. Multiple archives can be concatenated and extracted with the -e option.

# CAVEATS

Executes shell code from the archive, posing security risks with untrusted files. Always verify archive source and contents before extraction. Some archives may require specific shell features. Part of the sharutils package.

# HISTORY

**unshar** and shell archives date back to early Unix when email was the primary method of sharing software. The shar format allowed binary and text files to be encoded in a form that could survive email transmission. While largely superseded by tar and zip, shar archives still appear in legacy code distributions and mailing list archives.

# SEE ALSO

[shar](/man/shar)(1), [tar](/man/tar)(1), [unzip](/man/unzip)(1), [uudecode](/man/uudecode)(1)
