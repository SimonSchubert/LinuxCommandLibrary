# TAGLINE

plagiarism detector for programming assignments

# TLDR

Run an analysis on a **set of source files**

```dolos run [path/to/files/*]```

Open results in a **local web UI**

```dolos run -f web [path/to/files/*]```

Set the **language** explicitly

```dolos run -l [python] [path/to/files/*]```

Ignore **template/boilerplate** code

```dolos run -i [path/to/template] [path/to/files/*]```

Write a **CSV** report

```dolos run -f csv [path/to/files/*]```

**Serve** a previously generated report

```dolos serve [path/to/report_directory]```

# SYNOPSIS

**dolos** _command_ [_options_] [_paths_...]

# COMMANDS

**run** [_options_] _files_...
> Tokenize submissions, compare them, and write a report.

**serve** _report_dir_
> Serve an existing analysis directory in the browser.

# PARAMETERS

**-f**, **--output-format** _web|csv|..._
> How to present results. **web** starts a local viewer.

**-l**, **--language** _name_
> Programming language of the files (otherwise inferred from extensions).

**-i**, **--ignore** _file_
> Template or boilerplate to exclude from matching.

**-h**, **--help**
> Show help.

**-v**, **--version**
> Print version.

# DESCRIPTION

**dolos** (Dodona, Ghent University) finds similar fragments across student programming submissions. It tokenizes source, compares pairs, and highlights copied regions. Typical use is a directory of assignment files plus optional template code to ignore.

The **web** format launches a local UI for browsing pairs and overlap. CSV is for further processing. Language coverage includes common teaching languages; pass **-l** when extensions are mixed or missing.

# CAVEATS

High similarity is not proof of cheating; shared starter code, generated code, and small assignments inflate scores. Always ignore official templates. Serving reports binds a local HTTP port; do not expose student work on a public interface.

# HISTORY

Developed for the Dodona learning platform at Ghent University.

# SEE ALSO

[diff](/man/diff)(1), [git-diff](/man/git-diff)(1)

# RESOURCES

```[Homepage](https://dolos.ugent.be/)```

```[Documentation](https://dolos.ugent.be/docs/running.html)```

```[Source code](https://github.com/dodona-edu/dolos)```

<!-- verified: 2026-08-26 -->
