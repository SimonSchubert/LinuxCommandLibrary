# TAGLINE

command runner that reads recipes from a justfile

# TLDR

**Run default recipe**

```just```

**Run specific recipe**

```just [recipe]```

**Run recipe with arguments**

```just [recipe] [arg1] [arg2]```

**List available recipes**

```just --list```

**Show recipe source**

```just --show [recipe]```

**Print commands** without running them

```just --dry-run [recipe]```

**Override a variable** for this run

```just --set [variable] [value] [recipe]```

**Pick recipes interactively** with fzf

```just --choose```

**Format** the justfile in place

```just --fmt```

Run a recipe from the **global justfile**

```just -g [recipe]```

# SYNOPSIS

**just** [_options_] [_recipe_ [_arguments_]...]...

# PARAMETERS

**-l**, **--list** [_MODULE_]
> List available recipes with their doc comments.

**-s**, **--show** _recipe_
> Show recipe source code.

**--summary**
> List recipe names on one line.

**-f**, **--justfile** _file_
> Use specified justfile.

**-d**, **--working-directory** _dir_
> Use this directory as working directory (requires **--justfile**).

**-g**, **--global-justfile**
> Use the global justfile, such as ~/.config/just/justfile.

**-n**, **--dry-run**
> Print commands without executing.

**--set** _variable_ _value_
> Override a variable's value.

**--choose**
> Select recipe interactively using **--chooser** or $JUST_CHOOSER, default fzf.

**-e**, **--edit**
> Edit the justfile with $VISUAL or $EDITOR.

**--evaluate** [_variable_]
> Evaluate and print variables.

**--variables**
> List variable names.

**--fmt**
> Format and overwrite the justfile; add **--check** to only check formatting.

**--dump**
> Print the justfile; **--dump-format json** prints it as JSON.

**--init**
> Create a new justfile in the project root.

**--groups**
> List recipe groups.

**--completions** _shell_
> Print a shell completion script.

**--man**
> Print the man page.

**-c**, **--command** _command_
> Run an arbitrary command with the justfile's environment and exports.

**--shell** _shell_, **--shell-arg** _arg_
> Shell and shell arguments used to run recipes.

**--dotenv-path** _path_
> Load environment variables from this file instead of .env.

**--yes**
> Automatically confirm recipes marked with [confirm].

**-u**, **--unsorted**
> List recipes in justfile order instead of alphabetically.

**-q**, **--quiet**
> Suppress all output.

**-v**, **--verbose**
> Use verbose output; repeat for more.

**--timestamp**
> Print timestamps with recipe lines.

# DESCRIPTION

**just** is a command runner that reads recipes from a justfile. It provides a convenient way to save and run project-specific commands. Syntax is inspired by make but focused on running commands rather than building. Recipes can be written in any language.

just searches for a file named **justfile** (case-insensitive, also **.justfile**) in the current directory and its parents. Recipes run with the justfile's directory as working directory by default, support parameters, dependencies, variables, **.env** loading, attributes and modules.

# CAVEATS

Not a build system: recipes always run, with no file timestamp tracking. Each recipe line runs in a new shell unless the recipe uses a shebang or **[script]**. Some features, such as user-defined functions, require **--unstable** or **set unstable**.

# HISTORY

**just** was created by **Casey Rodarmor** in **2016** and is written in **Rust**. Version 1.0 was released in 2022 with a backwards-compatibility promise.

# SEE ALSO

[just](/man/just)(1), [make](/man/make)(1), [task](/man/task)(1), [fzf](/man/fzf)(1)

# RESOURCES

```[Source code](https://github.com/casey/just)```

```[Homepage](https://just.systems)```

```[Documentation](https://just.systems/man/en/)```

<!-- verified: 2026-09-29 -->
