# Search & Find

## Getting Started
Three different jobs, three tool families: **find** walks the filesystem live and can filter on any attribute, **locate** answers instantly from a prebuilt index, and **grep** searches inside files. **fd**, **plocate**, and **rg** are their modern, faster counterparts.

## Find Files by Name
**find** needs a starting directory; **-iname** matches case-insensitively. **fd** searches the current directory by default, ignores hidden and git-ignored files, and uses regex patterns.
```[find](/man/find) . -iname "*report*"```
```[find](/man/find) / -name "[fileName]" 2>/dev/null```
```[fd](/man/fd) [query]```
```[fd](/man/fd) -e pdf [query]```

> Searching from **/** prints permission errors for directories you cannot read; **2>/dev/null** hides them.

## Find by Type, Size, and Age
Tests combine freely: a number like **-7** means "less than", **+7** means "more than", a bare **7** means "exactly".
```[find](/man/find) . -type f -size +10M -size -100M```
```[find](/man/find) . -type f -empty```
```[find](/man/find) . -type d -empty```
```[find](/man/find) . -mmin -60```
```[find](/man/find) . -mtime -7```
```[find](/man/find) . -mtime +30```

| Test | Description |
|-----|-------------|
| **-type f / -type d** | Files / directories |
| **-size +10M** | Larger than 10 MB |
| **-mmin -60** | Content modified less than 60 minutes ago |
| **-mtime -7** | Content modified within the last 7 days |
| **-cmin / -ctime** | Status (permissions, owner) changed |
| **-atime** | Last accessed |
| **-empty** | Empty file or directory |
| **-user name** | Owned by a user |

## Act on What You Find
**-exec** runs a command on every match; **{}** is replaced by the file name. Ending with **+** passes many files per invocation instead of one at a time. **-delete** removes matches directly.
```[find](/man/find) . -name "*.tmp" -delete```
```[find](/man/find) . -name "*.sh" -exec [chmod](/man/chmod) +x {} +```
```[find](/man/find) . -type f -exec [grep](/man/grep) -l "TODO" {} +```

> Test destructive commands first: replace **-delete** or **-exec rm** with **-print**, check the list, then run it for real.

## Indexed Search
**locate** finds path names instantly from an index instead of scanning the disk. The index is updated periodically by **updatedb**, so very new files may be missing. **plocate** is the faster modern implementation.
```[locate](/man/locate) [query]```
```[plocate](/man/plocate) [query]```
```sudo [updatedb](/man/updatedb)```

## Search File Contents
**grep -r** searches directories recursively; **-n** shows line numbers, **-i** ignores case, **-l** lists only file names. **rg** (ripgrep) is recursive by default, skips git-ignored files, and is much faster on big trees.
```[grep](/man/grep) "[query]" [file]```
```[grep](/man/grep) -rni "[query]" [path]```
```[grep](/man/grep) -rl "[query]" [path]```
```[rg](/man/rg) "[query]"```
```[rg](/man/rg) -t py "[query]"```
```[ag](/man/ag) "[query]"```

Search the output of any command by piping it through grep.
```[history](/man/history) | [grep](/man/grep) "[phrase]"```
```[ps](/man/ps) aux | [grep](/man/grep) "[processName]"```

## Fuzzy Finding
**fzf** filters any list interactively as you type. On its own it fuzzy-finds files; combined with other commands it becomes a universal picker.
```[fzf](/man/fzf)```
```[vim](/man/vim) $([fzf](/man/fzf))```
```[history](/man/history) | [fzf](/man/fzf)```

> fzf's shell integration binds **Ctrl+R** (history), **Ctrl+T** (files), and **Alt+C** (cd into directory).

## Find Commands
Where does a command live, and what is it really?
```[which](/man/which) [command]```
```[whereis](/man/whereis) [command]```
```type [command]```
```command -v [command]```

> **whereis** also finds the man page and source. **type** is the shell's own view and correctly reports aliases, functions, and builtins.
