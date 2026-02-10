# TAGLINE

processes gcov code coverage data

# TLDR

**Capture coverage data**

```lcov --capture --directory [.] --output-file [coverage.info]```

**Generate HTML report**

```genhtml [coverage.info] --output-directory [coverage/]```

**Remove patterns**

```lcov --remove [coverage.info] '*/test/*' -o [filtered.info]```

**Extract specific files**

```lcov --extract [coverage.info] '*/src/*' -o [src.info]```

**Combine traces**

```lcov --add-tracefile [a.info] --add-tracefile [b.info] -o [combined.info]```

**Zero counters**

```lcov --zerocounters --directory [.]```

# SYNOPSIS

**lcov** [_options_]

# PARAMETERS

**--capture**
> Capture coverage data.

**--directory** _DIR_
> Source directory.

**--output-file** _FILE_
> Output trace file.

**--remove** _FILE_ _PATTERN_
> Remove matching files.

**--extract** _FILE_ _PATTERN_
> Extract matching files.

**--add-tracefile** _FILE_
> Add trace file.

**--help**
> Display help information.

# DESCRIPTION

**lcov** processes gcov code coverage data. It collects and manipulates coverage information.

The tool generates coverage reports from gcc/gcov data. Use genhtml to create HTML reports.

# CAVEATS

Requires gcc/gcov. C/C++ focused. Part of LCOV package.

# HISTORY

lcov was created for the **Linux Test Project** to provide graphical code coverage analysis.

# SEE ALSO

[gcov](/man/gcov)(1), [genhtml](/man/genhtml)(1), [gcovr](/man/gcovr)(1)
