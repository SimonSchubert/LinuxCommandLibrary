# TAGLINE

Feature-rich todo.txt task manager

# TLDR

**List tasks**

```topydo ls```

**Add task**

```topydo add "[task description]"```

**Complete task**

```topydo do [number]```

**Set priority**

```topydo pri [number] [A]```

**Postpone task**

```topydo postpone [number] [1w]```

**Interactive mode**

```topydo prompt```

# SYNOPSIS

**topydo** _command_ [_options_] [_args_]

# PARAMETERS

**ls**
> List tasks.

**add**
> Add task.

**do**
> Complete task.

**pri**
> Set priority.

**postpone**
> Delay task.

**prompt**
> Interactive mode.

# DESCRIPTION

**topydo** is a feature-rich command-line todo list manager that uses the todo.txt format while adding capabilities like recurring tasks, relative date handling, and task dependencies. It maintains full compatibility with other todo.txt tools and clients.

The interactive **prompt** mode provides a continuous session for managing tasks without restarting the tool. Tasks can be postponed with relative date expressions like "1w" for one week, and recurring tasks automatically create new instances when completed.

# CAVEATS

Python required. todo.txt format. Configuration recommended.

# HISTORY

**topydo** was created as a feature-rich, Python-based todo.txt client with recurring task support.

# SEE ALSO

[todo.sh](/man/todo.sh)(1), [task](/man/task)(1), [todoman](/man/todoman)(1)
