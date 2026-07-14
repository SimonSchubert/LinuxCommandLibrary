# TAGLINE

intelligent archive extraction tool

# TLDR

**Extract an archive** into its own directory

```dtrx [archive.tar.gz]```

**Extract multiple archives**

```dtrx [*.tar.gz]```

**List archive contents** without extracting

```dtrx -l [archive.tar.gz]```

**Extract into the current directory** instead of a dedicated one

```dtrx -f [archive.tar.gz]```

**Extract nested archives** too, recursively

```dtrx -r [archive.tar.gz]```

**Overwrite** an existing target directory instead of picking a new name

```dtrx -o [archive.tar.gz]```

**Extract the metadata** from a .deb or .gem

```dtrx -m [package.deb]```

**Never prompt**, taking conservative defaults

```dtrx -n [archive.tar.gz]```

# SYNOPSIS

**dtrx** [_options_] _archive_...

# PARAMETERS

_ARCHIVE_
> Archive file(s) to extract.

**-r**, **--recursive**
> Look inside the archive for further archives and extract those as well.

**-f**, **--flat**
> Extract everything into the **current** directory rather than a dedicated one.

**-o**, **--overwrite**
> Use the default directory name even if it already exists, overwriting it, instead of choosing an alternative name. This is **not** an output-directory option.

**-l**, **-t**, **--list**, **--table**
> List the contents without extracting.

**-m**, **--metadata**
> Extract the *metadata* from a `.deb` or `.gem` package rather than its contents.

**--one**, **--one-entry** _MODE_
> How to handle an archive containing a single file or directory: **inside** (wrap it in a directory named after the archive; the default), **rename** (rename it to match the archive), or **here** (extract it into the current directory as-is).

**-n**, **--noninteractive**
> Never prompt; use conservative defaults instead.

**-q**, **--quiet**
> Suppress warnings. Give it twice for silence.

**-v**, **--verbose**
> List the files extracted. Give it twice for debugging output.

**--help** / **--version**
> Display help, or version and copyright information.

# DESCRIPTION

**dtrx** stands for "Do The Right Extraction", and its purpose is to remove every decision you would otherwise have to make about an archive.

It identifies the format from the *contents* rather than the file name, so it handles tar in all its compressions, zip, rar, 7z, cpio, deb, rpm, gem, and more without being told which is which, and it invokes whichever underlying tool is appropriate.

Its most valuable behaviour is preventing a **tarbomb**: an archive whose members are not wrapped in a top-level directory and which therefore scatters files across your current directory. dtrx always extracts into a single directory named after the archive, and if the archive already has one sensible top-level directory it uses that instead of nesting redundantly. Where a name would collide, dtrx picks a fresh one rather than clobbering what is there.

It also normalises permissions, so a directory that arrives unreadable or a file that arrives world-writable is corrected on extraction.

# CAVEATS

**-o does not take an output directory.** It means *overwrite*, and passing `dtrx -o mydir archive.tar.gz` will try to extract two things: the archive, and a file called `mydir`. To extract somewhere specific, change directory first. Likewise **-m** does not preserve ownership or permissions; it extracts the metadata section of a `.deb` or `.gem`.

dtrx is a front end and does not implement any format itself, so it can only handle what is installed: without `unrar` or `p7zip` on the system, the corresponding archives simply fail.

The original project has been unmaintained for years, and its Python 2 codebase forced distributions either to drop it or to carry a Python 3 port, so the version available varies. **atool** covers much the same ground and is still maintained.

# HISTORY

dtrx was written by **Brett Smith** in **2006**, in a period when the tarbomb was a genuine hazard and every archive format wanted a different incantation, `tar xzf` here, `tar xjf` there, `unzip` for one thing and `unrar x` for another. The tool's premise, that the computer can obviously work this out for itself, was compelling enough that it became a fixture in distributions long after `tar` grew automatic decompression detection and made half the original problem go away.

# SEE ALSO

[tar](/man/tar)(1), [unzip](/man/unzip)(1), [7z](/man/7z)(1), [atool](/man/atool)(1), [unar](/man/unar)(1)

# RESOURCES

```[Source code](https://github.com/dtrx-py/dtrx)```

<!-- verified: 2026-07-14 -->

