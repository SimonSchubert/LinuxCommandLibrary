# TLDR

**Add task**

```todoist add "[task description]"```

**List tasks**

```todoist list```

**Complete task**

```todoist close [task-id]```

**Add with due date**

```todoist add "[task]" --date "[tomorrow]"```

**Add to project**

```todoist add "[task]" --project "[Project Name]"```

**Sync**

```todoist sync```

# SYNOPSIS

**todoist** _command_ [_--date date_] [_--project name_] [_options_]

# PARAMETERS

**add**
> Create task.

**list**
> Show tasks.

**close**
> Complete task.

**sync**
> Sync with server.

**--date** _DATE_
> Due date.

**--project** _NAME_
> Target project.

**--priority** _N_
> Priority level.

# DESCRIPTION

**todoist** manages Todoist tasks. It's a CLI for the service.

Cloud sync. Access everywhere.

Natural dates. "tomorrow", "next week".

Project organization. Group tasks.

Priority support. Four levels.

# CAVEATS

Todoist account required. API token needed. Internet dependent.

# HISTORY

Various **todoist** CLI clients exist for the **Todoist** task management service, providing terminal access.

# SEE ALSO

[task](/man/task)(1), [todo.sh](/man/todo.sh)(1), [todoman](/man/todoman)(1)
