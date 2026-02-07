# TAGLINE

Firebase platform management CLI

# TLDR

**Login to Firebase**

```firebase login```

**Initialize project**

```firebase init```

**Deploy all services**

```firebase deploy```

**Deploy only hosting**

```firebase deploy --only hosting```

**Deploy only functions**

```firebase deploy --only functions```

**Start local emulators**

```firebase emulators:start```

**List projects**

```firebase projects:list```

# SYNOPSIS

**firebase** [_options_] _command_

# PARAMETERS

**login**
> Authenticate with Google account.

**logout**
> Sign out.

**init**
> Initialize Firebase project in directory.

**deploy**
> Deploy to Firebase services.

**--only** _services_
> Deploy specific services.

**serve**
> Start local development server.

**emulators:start**
> Start Firebase emulators.

**projects:list**
> List available projects.

**use** _project_
> Switch active project.

**functions:log**
> View Cloud Functions logs.

**hosting:disable**
> Disable hosting for project.

# CONFIGURATION

**firebase.json**
> Project configuration including hosting rules, function settings, and database rules.

**.firebaserc**
> Project aliases and active project selection.

# DESCRIPTION

**firebase** is the CLI for Firebase, Google's mobile and web application platform. It manages deployments for Hosting, Cloud Functions, Firestore, Realtime Database, Authentication, and other Firebase services.

The CLI handles project initialization, local development with emulators, and deployment workflows. It integrates with Google Cloud and supports multiple environments.

# CAVEATS

Requires Node.js. Google account needed for authentication. Some services require billing. Emulators need Java for some services. Project configuration stored in firebase.json.

# HISTORY

Firebase was founded in **2011** and acquired by **Google** in **2014**. The Firebase CLI evolved from basic hosting deployment to support the expanding Firebase platform including Cloud Functions, Firestore, and comprehensive local emulation.

# SEE ALSO

[gcloud](/man/gcloud)(1), [npm](/man/npm)(1), [node](/man/node)(1)
