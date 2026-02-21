# TAGLINE

line-by-line file comparison tool

# TLDR

**Compare** files

```diff [file1.txt] [file2.txt]```

**Unified** format

```diff -u [file1.txt] [file2.txt]```

**Compare** directories

```diff -r [dir1] [dir2]```

**Side-by-side** comparison

```diff -y [file1.txt] [file2.txt]```

**Ignore** whitespace

```diff -w [file1.txt] [file2.txt]```

# SYNOPSIS

**diff** [_options_] _file1_ _file2_

# DESCRIPTION

**diff** compares files line by line and outputs the differences. It's essential for version control, code review, and understanding changes between file versions.

The tool forms the basis of patch files and is used by version control systems.

# PARAMETERS

**-u**, **--unified**
> Unified diff format (recommended)

**-c**, **--context**
> Context diff format

**-y**, **--side-by-side**
> Side-by-side comparison

**-r**, **--recursive**
> Recursively compare directories

**-q**, **--brief**
> Report only if files differ

**-s**, **--report-identical-files**
> Report when files are identical

**-w**, **--ignore-all-space**
> Ignore whitespace changes

**-b**, **--ignore-space-change**
> Ignore whitespace amount changes

**-B**, **--ignore-blank-lines**
> Ignore blank line changes

**-i**, **--ignore-case**
> Case-insensitive comparison

**-N**, **--new-file**
> Treat missing files as empty

# OUTPUT FORMATS

**Normal format:**
```
3c3
< old line
---
> new line
```

**Unified format (-u):**
```
--- file1.txt
+++ file2.txt
@@ -1,3 +1,3 @@
 context
-old line
+new line
 context
```

**Context format (-c):**
```
*** file1.txt
--- file2.txt
***************
*** 1,3 ****
  context
! old line
  context
--- 1,3 ----
  context
! new line
  context
```

# WORKFLOW

```bash
# Basic comparison
diff file1.txt file2.txt

# Unified diff (best for patches)
diff -u original.txt modified.txt

# Save as patch
diff -u original.txt modified.txt > changes.patch

# Compare directories
diff -r old_version/ new_version/

# Ignore whitespace
diff -w file1.txt file2.txt

# Brief output
diff -q file1.txt file2.txt

# Side by side
diff -y file1.txt file2.txt | less
```

# CREATING PATCHES

```bash
# Create patch
diff -u old.c new.c > fix.patch

# Apply patch
patch old.c < fix.patch

# Reverse patch
patch -R new.c < fix.patch
```

# DIRECTORY COMPARISON

```bash
# Compare directories
diff -r dir1/ dir2/

# Exclude files
diff -r --exclude="*.log" dir1/ dir2/

# Brief directory diff
diff -rq dir1/ dir2/
```

# EXIT STATUS

- **0** - Files are identical
- **1** - Files differ
- **2** - Error occurred

# CAVEATS

Large files can be slow. Binary files show as "differ" without details. Whitespace handling varies. Line endings (CRLF vs LF) can cause issues. Not suitable for binary comparison (use cmp).

# HISTORY

**diff** was written by **James W. Hunt** and **Doug McIlroy** at Bell Labs around **1974**, with the algorithm published in their joint paper in **1976**.

# SEE ALSO

[patch](/man/patch)(1), [git-diff](/man/git-diff)(1), [cmp](/man/cmp)(1), [vimdiff](/man/vimdiff)(1)
