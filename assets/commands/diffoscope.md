# TAGLINE

deep recursive file comparison tool

# TLDR

**Compare two files**

```diffoscope [file1] [file2]```

**Compare and output HTML report**

```diffoscope --html [report.html] [file1] [file2]```

**Compare with limited depth**

```diffoscope --max-diff-block-lines [100] [file1] [file2]```

**Compare directories recursively**

```diffoscope [dir1] [dir2]```

**Output JSON report**

```diffoscope --json [report.json] [file1] [file2]```

**Compare Debian packages**

```diffoscope [package1.deb] [package2.deb]```

**Exclude specific file patterns**

```diffoscope --exclude "[*.pyc]" [dir1] [dir2]```

# SYNOPSIS

**diffoscope** [_options_] _path1_ _path2_

# PARAMETERS

**--html** _file_
> Write HTML report to file.

**--text** _file_
> Write text report to file.

**--json** _file_
> Write JSON report to file.

**--max-diff-block-lines** _n_
> Maximum lines per diff block.

**--max-report-size** _bytes_
> Maximum report size.

**--exclude** _pattern_
> Exclude files matching pattern.

**--exclude-directory-metadata**
> Ignore directory metadata differences.

**--fuzzy-threshold** _n_
> Fuzzy matching threshold (0-400).

**--new-file**
> Treat absent files as empty.

**--no-default-limits**
> Remove default size limits.

**--diff-tool** _tool_
> External diff tool to use.

# DESCRIPTION

**diffoscope** performs deep comparison of files, recursively unpacking archives and examining contents. Unlike simple diff, it understands file formats and shows meaningful differences inside compressed files, images, binaries, and more.

The tool supports hundreds of file formats: archives (tar, zip, deb, rpm), binaries (ELF, PE), images (PNG, JPEG), documents (PDF), and many others. It uses specialized tools to decode each format before comparison.

diffoscope was created to debug reproducible build issues, helping identify why two builds of the same source produce different binaries. Output can be terminal text, HTML for web viewing, or JSON for programmatic processing.

# CAVEATS

Full functionality requires many external tools (binutils, unzip, etc.). Large files or deep archives may be slow to process. Some proprietary formats aren't supported. Memory usage can be high for large comparisons.

# HISTORY

diffoscope was created by the **Reproducible Builds** project, specifically by **Lunar** and others, starting in **2014**. Originally named "debbindiff" for Debian package comparison, it was renamed and generalized. The tool is central to the reproducible builds effort, helping developers understand why builds differ and fix the sources of non-determinism.

# SEE ALSO

[diff](/man/diff)(1), [cmp](/man/cmp)(1), [reprotest](/man/reprotest)(1)
