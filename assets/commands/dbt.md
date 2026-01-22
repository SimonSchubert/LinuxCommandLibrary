# TLDR

**Initialize a new dbt** project

```dbt init [project_name]```

**Run all models**

```dbt run```

**Run specific model**

```dbt run --select [model_name]```

**Test data quality**

```dbt test```

**Generate documentation**

```dbt docs generate```

**Serve documentation** locally

```dbt docs serve```

**Compile SQL without** executing

```dbt compile```

# SYNOPSIS

**dbt** _command_ [_options_]

# PARAMETERS

_COMMAND_
> dbt command to execute (run, test, build, compile, etc.).

**--select**, **-s** _MODEL_
> Select specific models to run.

**--exclude** _MODEL_
> Exclude specific models from run.

**--target**, **-t** _TARGET_
> Target profile to use.

**--profiles-dir** _DIR_
> Directory containing profiles.yml.

**--project-dir** _DIR_
> Directory containing dbt_project.yml.

**--full-refresh**
> Rebuild incremental models from scratch.

**--vars** _JSON_
> Pass variables as JSON.

**--help**
> Display help information.

# DESCRIPTION

**dbt** (data build tool) is a transformation workflow tool that enables data analysts and engineers to transform data in their warehouse using SQL. It follows software engineering practices like version control, testing, and documentation for data transformations.

dbt works with your existing data warehouse (Snowflake, BigQuery, Redshift, PostgreSQL, etc.) and manages the T in ELT (Extract, Load, Transform). Models are defined as SQL SELECT statements that dbt materializes as tables or views.

The tool provides dependency management between models, automated testing with schema tests and custom tests, documentation generation, and incremental processing for efficient updates of large datasets.

# CAVEATS

Requires Python and a connection to a supported data warehouse. Complex dependencies may lead to long DAG resolution times. Resource usage scales with project size. Breaking changes occasionally occur between major versions.

# HISTORY

dbt was created by **Fishtown Analytics** (now dbt Labs) and released in **2016**. It pioneered the "analytics engineering" approach, bringing software development practices to data transformation and helping establish the modern data stack paradigm.

# SEE ALSO

[python](/man/python)(1), [psql](/man/psql)(1), [bq](/man/bq)(1)
