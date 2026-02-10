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

**Show task graph**

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
> Central scheduler host.

**--log-level** _level_
> Logging level.

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

Central scheduler recommended for production. No built-in triggering (use cron). Targets define completion. Python 3 required.

# HISTORY

Luigi was developed at **Spotify** and open-sourced in **2012** for managing complex data pipelines and machine learning workflows.

# SEE ALSO

[airflow](/man/airflow)(1), [prefect](/man/prefect)(1), [dask](/man/dask)(1), [celery](/man/celery)(1)
