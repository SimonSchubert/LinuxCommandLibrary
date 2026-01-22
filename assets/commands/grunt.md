# TLDR

**Run default task**

```grunt```

**Run specific task**

```grunt [task-name]```

**List available tasks**

```grunt --help```

**Run with verbose output**

```grunt --verbose```

**Force task completion**

```grunt --force```

**Initialize Gruntfile**

```grunt-init```

# SYNOPSIS

**grunt** [_options_] [_tasks_]

# PARAMETERS

_TASKS_
> Tasks to execute.

**-f**, **--force**
> Force execution despite warnings.

**-v**, **--verbose**
> Verbose output.

**--no-color**
> Disable colored output.

**--gruntfile** _FILE_
> Specify Gruntfile.

**--help**
> Display help information.

# DESCRIPTION

**Grunt** is a JavaScript task runner for automating repetitive tasks. It handles minification, compilation, testing, and linting through plugins.

The tool reads configuration from Gruntfile.js. It was widely used before npm scripts and newer build tools like Gulp and webpack.

Grunt automates JavaScript project tasks.

# CAVEATS

Requires Node.js. Configuration can be verbose. Newer alternatives exist (Gulp, npm scripts).

# HISTORY

Grunt was created by **Ben Alman** in **2012** as one of the first JavaScript task runners.

# SEE ALSO

[gulp](/man/gulp)(1), [npm](/man/npm)(1), [webpack](/man/webpack)(1)
