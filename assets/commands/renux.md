# TAGLINE

Terminal-based bulk file renamer with TUI

# TLDR

**Launch the file renamer TUI** in the current directory

```renux```

**Open the TUI with a directory, pattern and replacement** prefilled

```renux [path/to/directory] [IMG_] [Image_]```

**Preview a rename** without opening the TUI or changing files

```renux [path/to/directory] [IMG_] [Image_] --dry-run```

**Apply a rename immediately** without opening the TUI

```renux [path/to/directory] [IMG_] [Image_] -y```

**Change file extensions**

```renux [path/to/directory] [.txt] [.bak] --apply-to ext```

**Rename with a regex capture group**

```renux [path/to/directory] "[document (\d).pdf]" "[doc (\1).pdf]" -r```

**Add a counter** to filenames

```renux [path/to/directory] [file] "[file_{counter}]"```

**Exclude files** from the rename

```renux [path/to/directory] [old] [new] --exclude "[*.log]" -y```

**Undo the last rename** in a directory

```renux [path/to/directory] --undo```

# SYNOPSIS

**renux** [_directory_] [_pattern_] [_replacement_] [_options_]

# PARAMETERS

_directory_
> Directory containing the files (default: current directory).

_pattern_
> Search pattern, which can be a regular expression (default: empty).

_replacement_
> Replacement string, which may contain placeholders (default: empty).

**-c**, **--count** _COUNT_
> Maximum replacements per file (default: 0, unlimited).

**-r**, **--regex**
> Treat the pattern as a regular expression (default: enabled).

**--case-sensitive**
> Make the search case-sensitive (default: disabled).

**--apply-to** _TARGET_
> Part of the filename to rename: name (default), ext, or both.

**--exclude** _PATTERN_
> Exclude files by exact name or glob. Repeatable and evaluated in order, gitignore-style: prefix with **!** to re-include a file.

**-y**, **--yes**
> Apply the rename immediately without opening the TUI.

**--dry-run**
> Preview the rename without opening the TUI or changing any files.

**--undo**
> Undo the last rename applied to the directory without opening the TUI.

**--redo**
> Redo the last undone rename in the directory without opening the TUI.

# DESCRIPTION

**renux** is a terminal-based bulk file renamer that provides a TUI for renaming multiple files at once, plus headless modes for scripts and CI. It supports regular expressions with capturing groups, file exclusion, and backup with undo and redo.

Replacements can use placeholders: **{counter(start,step,padding)}** for incrementing numbers, **{now(format)}**, **{created_at(format)}** and **{modified_at(format)}** for dates, **{size(unit)}** for file size, and image and video metadata such as **{width}**, **{height}**, **{taken_at(format)}** and **{duration}**. Text filters are applied with a pipe, for example **{filename|slugify}**, and include lower, upper, title, camel, pascal, snake and kebab.

# HISTORY

**renux** was created by **Andrian Lloyd Maagma** (andrianllmm) and is written in **Python**.

# INSTALL

```aur: yay -S renux```

<!-- packages: 2026-11-09 -->

# SEE ALSO

[rename](/man/rename)(1), [mmv](/man/mmv)(1), [nomino](/man/nomino)(1)

# RESOURCES

```[Source code](https://github.com/andrianllmm/renux)```

<!-- verified: 2026-11-09 -->
