# TAGLINE

Execute Salt runner modules on the master

# TLDR

**List connected minions**

```salt-run manage.up```

**List disconnected minions**

```salt-run manage.down```

**Run orchestration**

```salt-run state.orchestrate [orch.deploy]```

**Show job status**

```salt-run jobs.lookup_jid [job_id]```

**Check minion versions**

```salt-run manage.versions```

# SYNOPSIS

**salt-run** [_options_] _function_ [_arguments_...]

# PARAMETERS

**manage.up**
> List online minions.

**manage.down**
> List offline minions.

**state.orchestrate** _sls_
> Run orchestration state.

**jobs.list_jobs**
> List recent jobs.

**jobs.lookup_jid** _jid_
> Get the results of a previously run job by its JID.

**jobs.active**
> Show jobs currently running across all minions.

**--out**, **--output** _format_
> Output format (json, yaml, highstate, etc.).

**-c** _DIR_, **--config-dir** _DIR_
> Use a custom Salt master configuration directory.

# DESCRIPTION

**salt-run** executes runner modules on the Salt master. Runners handle master-side operations like orchestration, job management, and cluster-wide tasks. Part of SaltStack configuration management.

# INSTALL

```apk: sudo apk add salt-lts-master```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[salt](/man/salt)(1), [salt-call](/man/salt-call)(1)

