# TLDR

**Search** for a pattern in current directory recursively

```ack [pattern]```

Search for a pattern in **specific file types**

```ack --type=[perl|python|ruby|js] [pattern]```

Search with **case insensitive** matching

```ack -i [pattern]```

List all **files that match** without showing matches

```ack -l [pattern]```

Show **context lines** around matches

```ack -C [3] [pattern]```

# SYNOPSIS

**ack** [_options_] _pattern_ [_file_|_directory_...]

# DESCRIPTION

**ack** is a code-searching tool designed as an alternative to grep, optimized for programmers. It automatically skips backup files, version control directories (.git, .svn), and binary files while searching recursively through source code.

The tool provides built-in file type filtering, allowing searches limited to specific programming languages. Output is formatted with color highlighting and file grouping for easier reading. It uses Perl regular expressions, providing powerful pattern matching capabilities.

# PARAMETERS

**-i**, **--ignore-case**
> Case insensitive search

**-v**, **--invert-match**
> Invert the match; select non-matching lines

**-w**, **--word-regexp**
> Match whole words only

**-l**, **--files-with-matches**
> Print only filenames containing matches

**-L**, **--files-without-matches**
> Print filenames that don't contain matches

**-c**, **--count**
> Print count of matching lines per file

**-C** _num_, **--context=**_num_
> Print num lines of context around matches

**-A** _num_, **--after-context=**_num_
> Print num lines after each match

**-B** _num_, **--before-context=**_num_
> Print num lines before each match

**--type=**_TYPE_
> Search only files of TYPE (perl, python, ruby, js, etc.)

**--nocolor**
> Disable color output

**-f**
> Print files that would be searched (dry run)

**--ignore-dir=**_name_
> Ignore directory name

**--help-types**
> List all recognized file types

# CAVEATS

**ack** is slower than newer tools like **ripgrep** or **ag** (The Silver Searcher) on large codebases. It requires Perl to be installed. Some file types may not be recognized by default and require custom configuration in .ackrc.

# HISTORY

**ack** was created by Andy Lester and first released in **2005**. It was designed to be a better grep for programmers, addressing common frustrations with searching through codebases. The tool influenced later search tools like **ag** and **ripgrep**.

# SEE ALSO

[grep](/man/grep)(1), [ag](/man/ag)(1), [rg](/man/rg)(1), [git-grep](/man/git-grep)(1)
