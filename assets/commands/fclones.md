# TAGLINE

high-performance duplicate file finder

# TLDR

**Find duplicate files**

```fclones group [directory]```

**Remove duplicates interactively**

```fclones group [directory] | fclones remove```

**Find duplicates by** content

```fclones group --depth [2] [directory]```

**Show duplicate statistics**

```fclones group [directory] --format fdupes```

**Move duplicates to** directory

```fclones group [directory] | fclones move [trash_dir]```

# SYNOPSIS

**fclones** _command_ [_options_] [_paths_...]

# PARAMETERS

_COMMAND_
> Operation: group, remove, link, move.

_PATHS_
> Directories or files to scan.

**--depth** _N_
> Maximum directory depth.

**--min** _SIZE_
> Minimum file size.

**--max** _SIZE_
> Maximum file size.

**--format** _FORMAT_
> Output format: default, fdupes, csv, json.

**-R**, **--follow-links**
> Follow symbolic links.

**--threads** _N_
> Number of threads.

**--help**
> Display help information.

# DESCRIPTION

**fclones** is a high-performance duplicate file finder written in Rust. It uses multiple algorithms including hash-based comparison and parallel processing for fast scanning of large file systems.

The tool works in two phases: finding duplicates with 'group' and acting on them with remove, link, or move. Output can be piped between commands or saved for review before action.

fclones optimizes for speed with techniques like partial hashing, caching, and SIMD acceleration.

# CAVEATS

Requires careful review before removal. Hard linking changes all copies. Large directories may use significant memory.

# HISTORY

fclones was created as a modern alternative to tools like fdupes, emphasizing performance through Rust's speed and memory safety. It achieves significant speedups through parallelism and optimized hashing.

# SEE ALSO

[fdupes](/man/fdupes)(1), [rmlint](/man/rmlint)(1), [jdupes](/man/jdupes)(1)
