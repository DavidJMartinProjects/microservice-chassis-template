mvn compile jib:dockerBuild
skaffold init --skip-build --force


*** JIB CONFIG ***
to point skaffold to the local docker image build by Jib, add the below to the generated skaffold.yaml

build:
  artifacts:
    - image: dave/sample
      context: .
      jib: {}
******************

skaffold dev --port-forward
skaffold delete