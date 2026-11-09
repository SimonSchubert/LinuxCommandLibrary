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

**Deploy a single function**

```firebase deploy --only functions:[function_name]```

**Deploy to a specific project**

```firebase deploy -P [project_id]```

**Deploy to a Hosting preview channel**

```firebase hosting:channel:deploy [channel_name]```

**Start local emulators**

```firebase emulators:start```

**Run a test script against the emulators**, then shut them down

```firebase emulators:exec "[npm test]"```

**View Cloud Functions logs**

```firebase functions:log```

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

**--only** _targets_
> Restrict deploy, serve or emulators to specific targets (e.g. hosting, functions:name).

**--except** _targets_
> Deploy to all targets except those listed.

**-m**, **--message** _message_
> Optional message describing the deploy.

**-P**, **--project** _id_
> Use the given project or alias for this command.

**serve**
> Start local development server.

**emulators:start**
> Start Firebase emulators.

**emulators:exec** _script_
> Start emulators, run a script, then shut them down.

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

Install with `npm install -g firebase-tools` (Node.js 20 or newer) or as a standalone binary with `curl -sL firebase.tools | bash`. A Google account is needed for authentication. Some services (Cloud Functions, extended Firestore usage) require a Blaze billing plan. The emulator suite requires Java for Firestore and Realtime Database emulators.

# HISTORY

Firebase was founded in **2011** and acquired by **Google** in **2014**. The Firebase CLI evolved from basic hosting deployment to support the expanding Firebase platform including Cloud Functions, Firestore, and comprehensive local emulation.

# SEE ALSO

[gcloud](/man/gcloud)(1), [npm](/man/npm)(1), [node](/man/node)(1)

# RESOURCES

```[Source code](https://github.com/firebase/firebase-tools)```

```[Homepage](https://firebase.google.com/)```

```[Documentation](https://firebase.google.com/docs/cli)```

<!-- verified: 2026-11-09 -->
