# TAGLINE

Deploy and manage Apache Airflow on the Astronomer platform

# TLDR

> The CLI binary is invoked as **astro**.

**Initialize** a new Airflow project

```astro dev init```

**Start** a local Airflow environment

```astro dev start```

**Stop** the local environment

```astro dev stop```

**Log in** to Astronomer

```astro login```

**Deploy** code to a Deployment

```astro deploy```

# SYNOPSIS

**astro** _command_ [_subcommand_] [_options_]

# DESCRIPTION

**astro** is the command-line interface for Astronomer, a platform for running Apache Airflow. It makes it easy to create, test, and deploy Airflow DAGs, providing tools for local Airflow development with Docker, deployment to Astro or Astronomer Software, and management of workspaces and deployments.

The tool streamlines Airflow workflows, from local testing to production deployment.

# PARAMETERS

**dev init**
> Create the files needed for a new Airflow project in the current directory.

**dev start**
> Build the project and start a local Airflow environment in Docker containers.

**dev stop**
> Pause the Docker containers running the local Airflow environment.

**dev restart**
> Stop, rebuild, and restart the local environment.

**deploy**
> Deploy project code to a Deployment.

**login**
> Authenticate to the Astro CLI.

**logout**
> Sign out of the Astro CLI.

**workspace list**
> List available workspaces.

**deployment list**
> List deployments.

**version**
> Show the CLI version.

# CAVEATS

Requires Docker for local development. Deployment requires an Astronomer account. Some commands are specific to either Astro (cloud) or Astronomer Software.

# HISTORY

The **Astro CLI** is developed by Astronomer (astronomer/astro-cli) to simplify Apache Airflow deployment and management. The single **astro** executable was introduced with version 1.0 to provide a shared framework across Astronomer products.

# SEE ALSO

[airflow](/man/airflow)(1), [docker](/man/docker)(1)

# RESOURCES

```[Source code](https://github.com/astronomer/astro-cli)```

```[Documentation](https://www.astronomer.io/docs/astro/cli/overview)```

<!-- verified: 2026-06-17 -->
