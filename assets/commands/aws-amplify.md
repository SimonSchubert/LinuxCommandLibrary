# TLDR

**Create** a new Amplify app

```aws amplify create-app --name [app_name] --repository [repo_url]```

**List** all Amplify apps in your account

```aws amplify list-apps```

**Create** a new branch for an app

```aws amplify create-branch --app-id [app_id] --branch-name [branch_name]```

**Start** a deployment job

```aws amplify start-job --app-id [app_id] --branch-name [branch_name] --job-type RELEASE```

**Associate** a custom domain with an app

```aws amplify create-domain-association --app-id [app_id] --domain-name [example.com]```

**Delete** an Amplify app

```aws amplify delete-app --app-id [app_id]```

# SYNOPSIS

**aws amplify** _command_ [_options_]

# DESCRIPTION

**AWS Amplify** enables developers to develop and deploy cloud-powered mobile and web applications with integrated CI/CD workflows. The service consists of two main components: **Amplify Hosting** for continuous delivery and hosting, and the **Amplify Framework** providing SDKs, libraries, and tools for client app development.

**Amplify Hosting** provides a fully managed hosting service with continuous deployment capabilities directly from Git repositories. It automatically builds and deploys web applications on every code commit, supporting modern frameworks like React, Angular, Vue, Next.js, and static site generators.

The service offers features including:

> **Continuous Deployment** - Automatically build and deploy from Git branches with every commit

> **Branch Deployments** - Deploy different branches to separate environments for feature testing and staging

> **Custom Domains** - Associate custom domains with SSL/TLS certificates managed automatically

> **Backend Environments** - Connect frontend branches to different backend environments

> **Access Control** - Protect branches with password authentication for preview environments

**Amplify Framework** provides client-side libraries and CLI tools for integrating AWS services like authentication, APIs, storage, and analytics into mobile and web applications without managing backend infrastructure.

# AVAILABLE COMMANDS

**create-app**
> Create a new Amplify app from a repository or manual deployment

**delete-app**
> Permanently delete an Amplify app and all associated resources

**get-app**
> Retrieve detailed information about a specific app

**list-apps**
> List all Amplify apps in the current region

**update-app**
> Update app configuration including build settings and environment variables

**create-branch**
> Create a new branch for continuous deployment

**delete-branch**
> Delete a branch and stop its deployments

**list-branches**
> List all branches for an app

**start-job**
> Manually trigger a build and deployment job

**stop-job**
> Cancel a running build or deployment job

**list-jobs**
> List build and deployment jobs for a branch

**create-deployment**
> Create a deployment for manually deployed apps

**start-deployment**
> Start a manual deployment

**create-domain-association**
> Associate a custom domain with an Amplify app

**update-domain-association**
> Update domain configuration and SSL settings

**delete-domain-association**
> Remove custom domain association

**create-webhook**
> Create a webhook for triggering builds from external sources

**create-backend-environment**
> Create a backend environment for an app

**tag-resource**
> Add metadata tags to Amplify resources

# CAVEATS

Git repository integration requires valid credentials and appropriate repository permissions. Custom domain verification requires DNS configuration changes. Build failures may occur if build settings don't match the project's framework requirements. Deleting an app permanently removes all branches, deployments, and associated data.

# HISTORY

**AWS Amplify** was announced at **AWS re:Invent 2017** as a framework and toolchain for mobile and web app development. **Amplify Console** (now Amplify Hosting) launched in **November 2018**, providing continuous deployment and hosting capabilities for modern web applications.

# SEE ALSO

[aws-cloudfront](/man/aws-cloudfront)(1), [aws-codecommit](/man/aws-codecommit)(1), [aws-cognito-idp](/man/aws-cognito-idp)(1), [aws](/man/aws)(1)
