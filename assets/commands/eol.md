# TLDR

**Check line endings** in file

```eol [file.txt]```

**Convert to Unix** line endings

```eol -u [file.txt]```

**Convert to Windows** line endings

```eol -d [file.txt]```

**Convert to Mac** classic endings

```eol -m [file.txt]```

**Process multiple files**

```eol -u [*.txt]```

# SYNOPSIS

**eol** [_options_] _files_...

# PARAMETERS

_FILES_
> Files to process.

**-u**, **--unix**
> Convert to Unix (LF).

**-d**, **--dos**
> Convert to DOS/Windows (CRLF).

**-m**, **--mac**
> Convert to classic Mac (CR).

**-q**, **--quiet**
> Quiet mode.

**--help**
> Display help information.

# DESCRIPTION

**eol** detects and converts line ending formats in text files. It handles the three common conventions: Unix (LF), DOS/Windows (CRLF), and classic Mac (CR).

Without conversion options, eol reports the current line ending format of files. With conversion flags, it transforms files to the specified format in place.

The tool is useful for cross-platform development and fixing files with inconsistent or incorrect line endings.

# CAVEATS

In-place conversion modifies files. Binary files may be corrupted. Mixed line endings may need multiple passes. Backup important files first.

# HISTORY

eol is one of several line ending conversion tools, addressing the long-standing incompatibility between Unix, Windows, and classic Mac text file formats that dates back to early computing.

# SEE ALSO

[dos2unix](/man/dos2unix)(1), [unix2dos](/man/unix2dos)(1), [file](/man/file)(1)
