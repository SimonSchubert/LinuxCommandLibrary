# TAGLINE

extracts RCS keywords from files

# TLDR

**Show RCS keywords**

```ident [file]```

**Process multiple files**

```ident [file1] [file2]```

**Quiet mode**

```ident -q [file]```

**Show version keyword only**

```ident -V [file]```

# SYNOPSIS

**ident** [_options_] [_files_]

# PARAMETERS

_FILES_
> Files to scan.

**-q**
> Quiet mode.

**-V**
> Show version only.

**--help**
> Display help information.

# DESCRIPTION

**ident** extracts RCS keywords from files. It finds and displays embedded version control information like $Id$ and $Revision$.

The tool scans binary and text files for RCS keyword patterns. It's used to identify file versions in builds.

# CAVEATS

Part of RCS package. Keywords must be expanded. Historical tool.

# HISTORY

ident is part of **RCS** (Revision Control System), predating modern version control systems.

# SEE ALSO

[rcs](/man/rcs)(1), [ci](/man/ci)(1), [co](/man/co)(1)
