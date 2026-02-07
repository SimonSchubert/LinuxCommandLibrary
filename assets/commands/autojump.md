# TAGLINE

Quickly navigate to frequently used directories

# TLDR

**Jump** to directory

```j [project]```

Jump to **child directory**

```jc [src]```

Open directory in **file manager**

```jo [downloads]```

Show **statistics**

```j --stat```

**Increase** directory weight

```j -i [+10]```

# SYNOPSIS

**j** [_-i weight_] [_-d weight_] [_--stat_] [_directory_]

# DESCRIPTION

**autojump** is a cd command replacement that learns your navigation patterns. It maintains a database of directories you visit, allowing quick jumps using partial names.

Instead of typing full paths, you can jump to frequently used directories with short, memorable patterns.

# PARAMETERS

**directory**
> Partial directory name to match

**-i** _weight_, **--increase** _weight_
> Manually increase directory weight

**-d** _weight_, **--decrease** _weight_
> Manually decrease directory weight

**--purge**
> Remove non-existent directories

**--stat**
> Show database entries and weights

**-h**, **--help**
> Show help

# ALIASES

- **j**: Main command
- **jc**: Jump to child directory
- **jo**: Open in file manager
- **jco**: Open child in file manager

# CAVEATS

Requires shell integration (add to .bashrc/.zshrc). Database builds over time; new directories won't jump initially. Similar tool: z, zoxide.

# HISTORY

**autojump** was created by Joël Schaerer around **2009** as one of the first "frecency" (frequency + recency) directory jumpers for shells.

# SEE ALSO

[z](/man/z)(1), [zoxide](/man/zoxide)(1), [cd](/man/cd)(1)
