# TLDR

**List available recipes**

```just --list```

**Run the default recipe**

```just```

**Run a specific recipe**

```just [recipe_name]```

**Run with arguments**

```just [recipe_name] [arg1] [arg2]```

**Run from a specific justfile**

```just --justfile [path/to/justfile] [recipe]```

**Show what would run** without executing

```just --dry-run [recipe]```

**Evaluate and print all variables**

```just --evaluate```

**Run recipe in specific directory**

```just --working-directory [path] [recipe]```

# SYNOPSIS

**just** [_options_] [_recipe_] [_arguments ..._]

# PARAMETERS

**-l**, **--list**
> List available recipes.

**-n**, **--dry-run**
> Print what would be executed without running.

**--evaluate**
> Evaluate and print all variables.

**-f**, **--justfile** _path_
> Use specified justfile.

**-d**, **--working-directory** _path_
> Run from specified directory.

**--set** _var value_
> Override variable value.

**--chooser** _program_
> Use program to select recipe interactively.

**--choose**
> Select recipe with chooser.

**-s**, **--show** _recipe_
> Show recipe definition.

**--summary**
> List recipes one per line.

**--dump**
> Print justfile in canonical form.

**--fmt**
> Format justfile.

**--check**
> Check justfile for errors.

**-q**, **--quiet**
> Suppress echoing of recipe lines.

**-v**, **--verbose**
> Verbose output.

**--color** _when_
> Color output: auto, always, never.

**--shell** _shell_
> Shell to use for recipes.

# DESCRIPTION

**just** is a command runner similar to make but focused on running project-specific commands rather than building targets. It uses a **justfile** (similar to Makefile) to define recipes - named sets of commands.

Recipes are defined with a name, optional parameters, and body of shell commands. Unlike make, just doesn't track file dependencies or timestamps; it simply runs the specified commands. This makes it ideal for task automation, development workflows, and project scripts.

Variables can be defined and used with **{{variable}}** syntax. Environment variables are accessible, and recipes can export variables. Conditionals, default values, and error handling are supported.

Just supports multiple shells (sh, bash, powershell, python, etc.) per recipe via shebang-like syntax. Recipes can have dependencies (other recipes to run first), and private recipes (prefixed with _) are hidden from --list.

Cross-platform support means justfiles work on Linux, macOS, and Windows. The tool is fast (written in Rust) and has no dependencies.

# CAVEATS

Not a build system - no incremental builds or dependency tracking. Different from make syntax despite similarities. Shell differences may affect cross-platform recipes. Variable scope differs from make. Comments use # (not supported in all recipe positions).

# HISTORY

**just** was created by Casey Rodarmor starting around **2016** as a simpler alternative to make for running commands. Frustrated with make's complexity and focus on building (rather than running), he designed just for the common use case of project-specific task running. The tool has gained popularity in the Rust community and beyond.

# SEE ALSO

[make](/man/make)(1), [task](/man/task)(1), [rake](/man/rake)(1), [npm-run-script](/man/npm-run-script)(1)
