# TAGLINE

Simple command-line task management

# TLDR

**Add task**

```todo add "[task description]"```

**List tasks**

```todo list```

**Complete task**

```todo done [id]```

**Remove task**

```todo rm [id]```

**Show task**

```todo show [id]```

**Clear completed**

```todo clear```

# SYNOPSIS

**todo** _command_ [_options_] [_args_]

# PARAMETERS

**add**
> Add task.

**list**
> Show tasks.

**done**
> Mark complete.

**rm**
> Remove task.

**show**
> Show details.

**clear**
> Remove done.

# DESCRIPTION

**todo** is a simple command-line task manager for creating, listing, completing, and removing tasks. It provides a minimal interface for quick task entry and progress tracking without the complexity of full-featured project management tools.

Multiple implementations exist under the name "todo," each with slightly different features and storage backends. The core workflow is consistent: add tasks with descriptions, mark them done when completed, and clear finished items from the list.

# CAVEATS

Multiple tools named todo. Check which installed. Features vary.

# HISTORY

Various **todo** implementations exist for command-line task management, each with slightly different features.

# SEE ALSO

[task](/man/task)(1), [todo.sh](/man/todo.sh)(1), [todoman](/man/todoman)(1)
