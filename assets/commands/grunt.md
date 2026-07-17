# TAGLINE

JavaScript task runner for automation

# TLDR

**Run default task**

```grunt```

**Run specific task**

```grunt [task-name]```

**Run multiple tasks in sequence**

```grunt [task-one] [task-two]```

**List available tasks and options**

```grunt --help```

**Run with verbose output**

```grunt --verbose```

**Force execution despite warnings**

```grunt --force```

**Use an alternate Gruntfile**

```grunt --gruntfile [path/to/Gruntfile.js] [task-name]```

**Perform a dry run without writing files**

```grunt --no-write```

# SYNOPSIS

**grunt** [_options_] [_tasks_]

# PARAMETERS

_TASKS_
> Tasks to execute, in order. Runs the **default** task if none is given.

**-f**, **--force**
> Continue past warnings instead of aborting.

**-v**, **--verbose**
> Verbose mode, printing more information about what Grunt is doing.

**-b**, **--base** _PATH_
> Alternate base path; file paths are relative to the Gruntfile by default.

**--no-color**
> Disable colored output.

**--gruntfile** _FILE_
> Specify an alternate Gruntfile.

**--no-write**
> Disable writing files (dry run).

**-d**, **--debug**
> Enable debugging mode for tasks that support it.

**--stack**
> Print a stack trace when exiting with a warning or fatal error.

**-V**, **--version**
> Print the Grunt version; combine with --verbose for plugin versions too.

**--help**
> Display help information.

# DESCRIPTION

**Grunt** is a JavaScript task runner for automating repetitive tasks. It handles minification, compilation, testing, and linting through a plugin ecosystem.

The tool reads configuration from Gruntfile.js. The globally-installed **grunt-cli** package provides the **grunt** command itself; it just locates and runs the version of Grunt installed locally in the project, which is what actually loads the Gruntfile and plugins. Grunt was widely used before npm scripts and newer build tools like Gulp and webpack gained popularity.

# CONFIGURATION

**Gruntfile.js**
> Project-level configuration file defining tasks, their options, and execution order.

**package.json**
> Lists Grunt plugins as devDependencies.

# CAVEATS

Requires Node.js. Configuration can be verbose. Newer alternatives exist (Gulp, npm scripts).

# HISTORY

Grunt was created by **Ben Alman** in **2012** as one of the first JavaScript task runners.

# SEE ALSO

[gulp](/man/gulp)(1), [npm](/man/npm)(1), [webpack](/man/webpack)(1)

# RESOURCES

```[Source code](https://github.com/gruntjs/grunt)```

```[Homepage](https://gruntjs.com/)```

```[Documentation](https://gruntjs.com/getting-started)```

<!-- verified: 2026-07-17 -->
