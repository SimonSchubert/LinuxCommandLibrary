# TAGLINE

python workflow engine for building complex pipelines of batch jobs

# TLDR

**Run task**

```luigi --module [mymodule] [MyTask]```

**Run with parameters**

```luigi --module [mymodule] [MyTask] --[param]=[value]```

**Run local scheduler**

```luigid```

**Run with workers**

```luigi --module [mymodule] [MyTask] --workers [4]```

**Run with local scheduler** (no central scheduler needed)

```luigi --module [mymodule] [MyTask] --local-scheduler```

# SYNOPSIS

**luigi** [_options_] _task_ [_task-params_]

# PARAMETERS

**--module** _name_
> Python module containing tasks.

**--workers** _n_
> Number of workers.

**--local-scheduler**
> Use local instead of central scheduler.

**--scheduler-host** _host_
> Central scheduler hostname.

**--scheduler-port** _port_
> Central scheduler port (default 8082).

**--log-level** _level_
> Logging level (DEBUG, INFO, WARNING, ERROR, CRITICAL).

**--help**
> Display available options and task parameters.

# DESCRIPTION

**Luigi** is a Python workflow engine for building complex pipelines of batch jobs. It handles dependency resolution, workflow management, visualization, and failure handling.

Tasks define dependencies via requires(), and Luigi ensures tasks run in correct order.

# TASK EXAMPLE

```python
import luigi

class MyTask(luigi.Task):
    param = luigi.Parameter()

    def requires(self):
        return UpstreamTask()

    def output(self):
        return luigi.LocalTarget('output.txt')

    def run(self):
        with self.output().open('w') as f:
            f.write(self.param)
```

# CAVEATS

Central scheduler recommended for production. No built-in triggering (use cron). Targets define task completion. Python 3 required. Parameter names with underscores must use hyphens on the command line (e.g., --my-parameter for my_parameter).

# HISTORY

Luigi was developed at **Spotify** and open-sourced in **2012** for managing complex data pipelines and machine learning workflows.

# SEE ALSO

[airflow](/man/airflow)(1), [prefect](/man/prefect)(1)
