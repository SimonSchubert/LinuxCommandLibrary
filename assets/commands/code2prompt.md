# TLDR

**Generate a prompt** from source code

```code2prompt [path/to/project]```

**Generate with specific template**

```code2prompt [path] --template [template_name]```

**Output to clipboard**

```code2prompt [path] --clipboard```

**Filter by file extensions**

```code2prompt [path] --filter [*.py,*.js]```

**Exclude patterns**

```code2prompt [path] --exclude [node_modules,*.log]```

# SYNOPSIS

**code2prompt** [_options_] _path_

# PARAMETERS

**--template** _name_
> Use a specific prompt template.

**--clipboard**
> Copy output to clipboard.

**--filter** _patterns_
> Include only files matching patterns.

**--exclude** _patterns_
> Exclude files matching patterns.

**--tokens**
> Count and display token usage.

# DESCRIPTION

**code2prompt** transforms source code into prompts for Large Language Models (LLMs). It traverses a codebase, formats the files with proper context, and generates prompts suitable for AI code assistants.

Useful for providing context to AI models when asking for code review, refactoring suggestions, or understanding unfamiliar codebases.

# SEE ALSO

[tree](/man/tree)(1), [find](/man/find)(1)
