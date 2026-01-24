# TLDR

**List tasks**

```todoman list```

**Add task**

```todoman new "[task description]"```

**Complete task**

```todoman done [id]```

**Edit task**

```todoman edit [id]```

**Delete task**

```todoman delete [id]```

**Show task**

```todoman show [id]```

# SYNOPSIS

**todoman** _command_ [_options_] [_args_]

# PARAMETERS

**list**
> List tasks.

**new**
> Create task.

**done**
> Complete task.

**edit**
> Modify task.

**delete**
> Remove task.

**--list** _NAME_
> Specify list.

# DESCRIPTION

**todoman** manages iCalendar todos. It's a CalDAV-compatible client.

Standard format. iCalendar VTODO.

CalDAV sync. Server integration.

Multiple lists. Calendar-based.

Recurring tasks. Repeat support.

# CAVEATS

Requires configured calendars. vdirsyncer recommended. Python-based.

# HISTORY

**todoman** was created for managing todo items in iCalendar format, with CalDAV server support via vdirsyncer.

# SEE ALSO

[vdirsyncer](/man/vdirsyncer)(1), [khal](/man/khal)(1), [task](/man/task)(1)
