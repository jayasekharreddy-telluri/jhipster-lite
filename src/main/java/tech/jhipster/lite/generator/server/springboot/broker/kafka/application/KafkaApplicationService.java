package tech.jhipster.lite.generator.server.springboot.broker.kafka.application;

import org.springframework.stereotype.Service;
import tech.jhipster.lite.docker.domain.DockerImages;
import tech.jhipster.lite.generator.project.domain.Project;
import tech.jhipster.lite.generator.server.springboot.broker.kafka.domain.KafkaModuleFactory;
import tech.jhipster.lite.generator.server.springboot.broker.kafka.domain.KafkaService;
import tech.jhipster.lite.module.domain.JHipsterModule;
import tech.jhipster.lite.module.domain.properties.JHipsterModuleProperties;

@Service
public class KafkaApplicationService {

  private final KafkaService kafkaService;

  private final KafkaModuleFactory kafkaModuleFactory;

  public KafkaApplicationService(final KafkaService kafkaService, final DockerImages dockerImages) {
    this.kafkaService = kafkaService;
    this.kafkaModuleFactory = new KafkaModuleFactory(dockerImages);
  }

  public JHipsterModule init(final JHipsterModuleProperties properties) {
    return kafkaModuleFactory.buildModule(properties);
  }

  public void addDummyProducerConsumer(final Project project) {
    kafkaService.addDummyProducerConsumer(project);
  }

  public void addAkhq(final Project project) {
    kafkaService.addAkhq(project);
  }
}
