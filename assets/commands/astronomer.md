# TAGLINE

Deploy and manage Apache Airflow on the Astronomer platform

# TLDR

**Deploy** Airflow DAG

```astronomer deploy```

**Initialize** new Airflow project

```astronomer dev init```

**Start** local Airflow environment

```astronomer dev start```

**Stop** local environment

```astronomer dev stop```

**Login** to Astronomer

```astronomer auth login```

# SYNOPSIS

**astronomer** _command_ [_options_]

# DESCRIPTION

**astronomer** is the CLI for Astronomer, a platform for deploying and managing Apache Airflow. It provides tools for local Airflow development, deployment to Astronomer Cloud or Enterprise, and DAG management.

The tool streamlines Airflow workflows, from local testing to production deployment.

# PARAMETERS

**dev init**
> Initialize Airflow project

**dev start**
> Start local Airflow

**dev stop**
> Stop local Airflow

**dev restart**
> Restart services

**deploy**
> Deploy to Astronomer

**auth login**
> Authenticate with Astronomer

**workspace list**
> List workspaces

**deployment list**
> List deployments

**version**
> Show version

# CAVEATS

Requires Docker for local development. Deployment requires Astronomer account. Some features specific to Astronomer platform.

# HISTORY

The **Astronomer CLI** was developed by Astronomer.io to simplify Apache Airflow deployment and management, released alongside their platform.

# SEE ALSO

[airflow](/man/airflow)(1), [docker](/man/docker)(1)
