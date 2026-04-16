# TAGLINE

source code to LLM prompt converter

# TLDR

**Generate a prompt** from source code and copy to clipboard

```code2prompt [path/to/project]```

**Use a custom Handlebars template**

```code2prompt [path] -t [template.hbs]```

**Write output to a file**

```code2prompt [path] --output-file [prompt.txt]```

**Include specific file patterns**

```code2prompt [path] --include "[*.py,*.js]"```

**Exclude patterns**

```code2prompt [path] --exclude "[node_modules,*.log]"```

**Show token count**

```code2prompt [path] --tokens```

**Generate from staged git changes**

```code2prompt [path] --diff```

# SYNOPSIS

**code2prompt** [_options_] _path_

# PARAMETERS

**-t**, **--template** _FILE_
> Path to a custom Handlebars template file.

**--include** _PATTERNS_
> Comma-separated glob patterns of files to include.

**--exclude** _PATTERNS_
> Comma-separated glob patterns of files to exclude.

**--exclude-from-tree**
> Remove excluded files from the source tree display.

**--output-file** _FILE_
> Write the generated prompt to a file instead of the clipboard.

**--tokens**
> Display token count of the generated prompt.

**--encoding** _NAME_
> Tokenizer to use: cl100k (default), p50k, p50k_edit, r50k_base.

**--json**
> Output results in JSON format.

**--diff**
> Include the git diff of staged files.

**--git-diff-branch** _BRANCH_
> Include the diff between branches.

**--git-log-branch** _BRANCH_
> Include the git log for a branch.

**--line-number**
> Prefix source lines with line numbers.

**--no-codeblock**
> Do not wrap code in markdown fenced blocks.

# DESCRIPTION

**code2prompt** transforms a source tree into a structured prompt for Large Language Models (LLMs). It recursively traverses a codebase, respects `.gitignore`, and formats files along with a file-tree overview. The output is copied to the clipboard by default.

Handlebars templates let you customize the generated prompt for specific workflows such as code review, documentation, refactoring, or PR description drafting. Token counting using tiktoken-compatible encodings helps keep prompts within model context limits.

Git integrations (`--diff`, `--git-diff-branch`, `--git-log-branch`) make it easy to generate prompts focused on recent changes rather than the entire codebase.

# SEE ALSO

[tree](/man/tree)(1), [find](/man/find)(1), [git](/man/git)(1)
