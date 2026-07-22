# TAGLINE

Strip directory and suffix from filenames.

# TLDR

**Extract** filename from path

```basename [/path/to/file.txt]```

**Remove** suffix

```basename [/path/to/file.txt] [.txt]```

**Multiple** files

```basename -a [/path/to/file1.txt] [/path/to/file2.txt]```

Remove **any suffix**

```basename -s [.txt] [/path/to/file.txt]```

# SYNOPSIS

**basename** _path_ [_suffix_]

# DESCRIPTION

**basename** removes directory components from a pathname, leaving only the final filename. It can optionally remove a trailing suffix, making it useful for extracting filenames in shell scripts.

The tool is part of GNU coreutils and commonly used in build scripts and file processing pipelines.

# PARAMETERS

**-a**, **--multiple**
> Process multiple arguments

**-s**, **--suffix=**_suffix_
> Remove trailing suffix

**-z**, **--zero**
> Separate output with NUL instead of newline

# BEHAVIOR

Given `/path/to/file.txt`:
- **basename** returns `file.txt`
- **basename** with suffix `.txt` returns `file`

# CAVEATS

Only removes a single trailing suffix exactly matching the argument — `basename file.tar.gz .gz` yields `file.tar`, not `file`. The path does not need to exist on disk. The two-argument form (positional suffix) is the POSIX behavior; `-s` plus `-a` is the GNU extension that supports multiple inputs and a non-positional suffix. In Bash scripts the parameter-expansion forms `${filepath##*/}` and `${name%.txt}` are faster than spawning `basename`.

# HISTORY

**basename** has been part of Unix since the early days, included in POSIX standards, and is available in GNU coreutils since **1992**.

# INSTALL

```apt: sudo apt install coreutils```

```dnf: sudo dnf install coreutils```

```pacman: sudo pacman -S coreutils```

```apk: sudo apk add coreutils```

```zypper: sudo zypper install coreutils```

```brew: brew install coreutils```

```nix: nix profile install nixpkgs#coreutils```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[dirname](/man/dirname)(1), [realpath](/man/realpath)(1), [readlink](/man/readlink)(1)
