# TLDR

**Pack repository**

```repomix```

**Pack specific directory**

```repomix [path/to/repo]```

**Custom output file**

```repomix -o [output.txt]```

**Include specific files**

```repomix --include "[*.ts,*.js]"```

**Exclude patterns**

```repomix --ignore "[node_modules,dist]"```

**XML output format**

```repomix --style xml```

# SYNOPSIS

**repomix** [_-o file_] [_--include pattern_] [_--ignore pattern_] [_path_]

# PARAMETERS

**-o**, **--output** _FILE_
> Output filename.

**--include** _PATTERN_
> Include patterns.

**--ignore** _PATTERN_
> Ignore patterns.

**--style** _FORMAT_
> Output style (plain, xml, markdown).

**--top-files-len** _N_
> Summary file count.

**-c**, **--config** _FILE_
> Config file path.

# DESCRIPTION

**repomix** packs repositories for AI. It creates single-file context.

Concatenates source files. Optimal for LLM input.

Respects gitignore. Skips ignored files.

Token counting included. Estimates context usage.

Multiple output formats. Plain, XML, Markdown.

# CAVEATS

Large repos may exceed limits. Binary files skipped. Needs Node.js.

# HISTORY

**repomix** was created to package codebases into a single file optimized for AI language model context windows.

# SEE ALSO

[git](/man/git)(1), [tree](/man/tree)(1), [cat](/man/cat)(1)
