# TAGLINE

removes print jobs from the queue

# TLDR

**Cancel all jobs**

```lprm -```

**Cancel specific job**

```lprm [job_id]```

**Cancel jobs on printer**

```lprm -P [printer] -```

**Cancel user's jobs**

```lprm [username]```

**Cancel job by ID on printer**

```lprm -P [printer] [job_id]```

# SYNOPSIS

**lprm** [_options_] [_job_]

# PARAMETERS

_JOB_
> Job ID or "-" for all.

**-P** _PRINTER_
> Specify printer.

**-E**
> Force encryption.

**-U** _USER_
> Specify username.

**--help**
> Display help information.

# DESCRIPTION

**lprm** removes print jobs from the queue. It cancels pending or processing jobs.

The tool is the BSD-style job removal command. Users can only remove their own jobs unless root.

# CAVEATS

Requires CUPS. Users limited to own jobs. May not stop printing in progress.

# HISTORY

lprm originated in **BSD Unix** for removing print jobs, now implemented by CUPS.

# SEE ALSO

[lp](/man/lp)(1), [lpr](/man/lpr)(1), [lpq](/man/lpq)(1), [cancel](/man/cancel)(1)

