mvn compile jib:dockerBuild

skaffold init --skip-build --force
skaffold dev --port-forward

skaffold delete

*** JIB CONFIG ***
to point skaffold to the docker image build by Jib, add the below to the generated skaffold.yaml

build:
  artifacts:
    - image: sample
      context: .
      jib: {}